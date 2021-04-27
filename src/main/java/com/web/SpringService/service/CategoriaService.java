package com.web.SpringService.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.SpringService.domain.Categoria;
import com.web.SpringService.repositories.CategoriaRepository;

public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria buscar(Integer id){
		Categoria obj = repository.findById(id);
		return obj;
	}
}
