package com.rafael.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.bookstore.domain.Categoria;
import com.rafael.bookstore.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!  id: " + id + ", tipo: " + Categoria.class.getName()));
	}
	
	public List<Categoria> findAll() {
		return repository.findAll();
	}
	
	public Categoria create(Categoria obj) {
		obj.setId(null);
		return repository.save(obj);
	}

}
