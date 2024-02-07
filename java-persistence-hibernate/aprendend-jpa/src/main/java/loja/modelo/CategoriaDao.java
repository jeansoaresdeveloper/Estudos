package loja.modelo;

import javax.persistence.EntityManager;

public class CategoriaDao {
    private final EntityManager entityManager;

    public CategoriaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Categoria categoria) {
        this.entityManager.persist(categoria);
    }
}
