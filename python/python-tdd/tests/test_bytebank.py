from bytebank import Funcionario
import pytest
from pytest import mark

class TestClass:

    def test_quando_idade_recebe_13_03_2000_deve_retornar_22(self):
        # Giver-Contexto
        entrada = '13/03/2000'
        esperado = 22

        funcionario_teste = Funcionario('teste', entrada, 1111)
        # When - Ação -> Resumindo a ação é invocar o método
        resultado = funcionario_teste.idade()

        # Then é o resultado a verificação final
        assert resultado == esperado

    def test_quando_nome_completo_recebe_Jean_Soares_retorna_Soares(self):
        # Given
        entrada = '     Jean Soares     '
        esperado = 'Soares'

        sobrenome_teste = Funcionario(entrada, '23/09/1999', 1111)
        #when
        resultado = sobrenome_teste.sobrenome()

        assert resultado == esperado

    def test_quando_decrescimo_salario_recebe_100000_deve_retornar_90000(self):
        # Given
        entrada_nome = 'Paulo Bragança'
        entrada_salario = 100000
        esperado = 90000

        funcionario_teste = Funcionario(entrada_nome, '11/11', entrada_salario)
        # When
        funcionario_teste.decrescimo_salario()
        resultado = funcionario_teste.salario

        assert resultado == esperado

    @mark.calcular_bonus
    def test_quando_calcular_bonus_recebe_1000_deve_retornar_100(self):
        # Given
        entrada = 1000
        esperado = 100

        funcionario_teste = Funcionario('Jean', '23/09/1999', entrada)
        # When
        resultado = funcionario_teste.calcular_bonus()

        # Then
        assert resultado == esperado

    @mark.calcular_bonus
    def test_quando_calcular_bonus_recebe_1000000_deve_retornar_exception(self):
        with pytest.raises(Exception):
            entrada = 1000000

            funcionario_teste = Funcionario('Jean', '23/09/1999', entrada)
            resultado = funcionario_teste.calcular_bonus()

            assert resultado
