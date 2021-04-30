package com.web.SpringService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.SpringService.domain.Categoria;
import com.web.SpringService.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria buscar(Integer id) {
		Categoria obj = repository.buscarPorId(id);
		return obj;
	}
}
