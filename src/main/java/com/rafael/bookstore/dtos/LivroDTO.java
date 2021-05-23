package com.rafael.bookstore.dtos;

import java.io.Serializable;

import com.rafael.bookstore.domain.Livro;

public class LivroDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String titulo;
	
	
	public LivroDTO(Livro obj) {
		super();
		// TODO Auto-generated constructor stub
	}


	public LivroDTO(Integer id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
