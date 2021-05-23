package com.rafael.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.bookstore.domain.Livro;
import com.rafael.bookstore.exception.ObjectNotFoundException;
import com.rafael.bookstore.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository repository;
	
	@Autowired
	private CategoriaService categoriaService;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado id: " + id + ", tipo: " + Livro.class.getName()));
	}

	public List<Livro> findAll(Integer id_cat) throws javassist.tools.rmi.ObjectNotFoundException {
		categoriaService.findById(id_cat);
		return repository.findAllByCategoria(id_cat);
	}
}
