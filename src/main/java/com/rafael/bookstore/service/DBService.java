package com.rafael.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.bookstore.domain.Categoria;
import com.rafael.bookstore.domain.Livro;
import com.rafael.bookstore.repositories.CategoriaRepository;
import com.rafael.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaReposiroty;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "informatica", "Livro de TI");
		Categoria cat2 = new Categoria(null, "terror", "Terremoto");
		Categoria cat3 = new Categoria(null, "fição", "Paraiso perdido");
		
		Livro l1 = new Livro(null, "Celan code", "Robert", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "Celan code", "Robert", "Lorem ipsum", cat1);
		Livro l3 = new Livro(null, "Celan code", "Robert", "Lorem ipsum", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3));
		
		this.categoriaReposiroty.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3));
	}
}
