package loja.testes;

import loja.modelo.Categoria;
import loja.modelo.CategoriaDao;
import loja.modelo.Produto;
import loja.modelo.ProdutoDao;
import loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class ProdutoTeste {


	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);

		List<Produto> produto = produtoDao.buscar();
		produto.forEach(p -> System.out.println(p.getNome()));
	}

	public static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		loja.modelo.Produto celular = new loja.modelo.Produto("Outro celular", "Muito legal", new BigDecimal("800"), celulares );

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin();

		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);

		em.getTransaction().commit();
		em.close();
	}
}
