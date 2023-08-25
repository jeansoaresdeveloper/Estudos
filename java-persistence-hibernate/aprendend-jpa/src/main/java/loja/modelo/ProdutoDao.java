package loja.modelo;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {
    private final EntityManager entityManager;

    public ProdutoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Produto produto) {
        this.entityManager.persist(produto);
    }

    public Produto buscaPorId(Long id) {
        return this.entityManager.find(Produto.class, id);
    }

    public List<Produto> buscar() {
        String jpql = "SELECT p from Produto p";
        return entityManager.createQuery(jpql, Produto.class).getResultList();
    }

    public List<Produto> buscarPorNome(String nome) {
        String jpql = "SELECT p from Produto p WHERE p.nome = :nome";
        return entityManager.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                .getResultList();
    }

}
