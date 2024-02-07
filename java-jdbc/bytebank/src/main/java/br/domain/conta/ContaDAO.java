package br.domain.conta;

import br.ConnectionFactory;
import br.domain.cliente.Cliente;
import br.domain.cliente.DadosCadastroCliente;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ContaDAO {

    private Connection connection;

    public ContaDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(DadosAberturaConta dadosAberturaConta) {
        var cliente = new Cliente(dadosAberturaConta.dadosCliente());
        var conta = new Conta(dadosAberturaConta.numero(), BigDecimal.ZERO, cliente, true);
        String sql = "INSERT INTO conta(numero, saldo, cliente_nome, cliente_cpf, cliente_email, ativo)" +
                "VALUE(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, conta.getNumero());
            preparedStatement.setBigDecimal(2, BigDecimal.ZERO);
            preparedStatement.setString(3, cliente.getNome());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setString(5, cliente.getEmail());
            preparedStatement.setBoolean(6, conta.getAtiva());

            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public Set<Conta> listar() {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Set<Conta> contas = new HashSet<>();
        String sql = "SELECT * FROM conta WHERE ativo = true";
        try {
            preparedStatement = this.connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Integer numeroConta = resultSet.getInt(1);
                BigDecimal saldo = resultSet.getBigDecimal(2);
                String nome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String email = resultSet.getString(5);
                Boolean isAtiva = resultSet.getBoolean(6);
                DadosCadastroCliente dadosCadastroCliente = new DadosCadastroCliente(nome, cpf, email);
                Cliente cliente = new Cliente(dadosCadastroCliente);
                contas.add(new Conta(numeroConta,saldo, cliente, isAtiva));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
        return contas;
    }

    public Conta buscarPorNumero(Integer numero) {
        String sql = "SELECT * FROM conta WHERE numero = ? AND ativo = true";

        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Conta conta = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, numero);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Integer numeroRecuperado = resultSet.getInt(1);
                BigDecimal saldo = resultSet.getBigDecimal(2);
                String nome = resultSet.getString(3);
                String cpf = resultSet.getString(4);
                String email = resultSet.getString(5);
                Boolean isAtiva = resultSet.getBoolean(6);

                DadosCadastroCliente dadosCadastroCliente =
                        new DadosCadastroCliente(nome, cpf, email);
                Cliente cliente = new Cliente(dadosCadastroCliente);

                conta = new Conta(numeroRecuperado, saldo, cliente, isAtiva);
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conta;
    }

    public void alteraSaldo(Integer numeroConta, BigDecimal valorDepositado) {
        PreparedStatement preparedStatement;
        String sql = "UPDATE conta SET saldo = ? WHERE numero = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBigDecimal(1, valorDepositado);
            preparedStatement.setInt(2, numeroConta);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void deletar(Integer numeroConta) {
        PreparedStatement preparedStatement;
        String sql = "DELETE FROM conta WHERE numero = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, numeroConta);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void deletarLogica(Integer numeroConta) {
        PreparedStatement preparedStatement;
        String sql = "UPDATE conta SET ativo = false WHERE numero = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, numeroConta);
            preparedStatement.execute();
            preparedStatement.close();
            connection.close();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }


    }
}
