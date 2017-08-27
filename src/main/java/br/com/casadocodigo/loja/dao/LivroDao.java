package br.com.casadocodigo.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.loja.models.Livro;

public class LivroDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salva(Livro livro) {
		manager.persist(livro);
	}

	public List<Livro> getLivros() {
		return manager.createQuery(
				"SELECT DISTINCT(l) FROM Livro l JOIN FETCH l.autores",
				Livro.class)
				.getResultList();
	}

}
