package br.com.casadocodigo.loja.beans;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.casadocodigo.loja.dao.LivroDao;
import br.com.casadocodigo.loja.models.Livro;

@Model //Replaces @Named + @RequestedScope
public class ListaLivrosBean {
	
	@Inject
	private LivroDao dao;
	
	public List<Livro> getLivros() {
		return dao.getLivros();
	}

}