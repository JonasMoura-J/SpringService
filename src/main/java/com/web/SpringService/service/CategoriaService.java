package com.web.SpringService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.SpringService.domain.Categoria;
import com.web.SpringService.repositories.CategoriaRepository;
import com.web.SpringService.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria buscar(Integer id) {
		Categoria obj = repository.buscarPorId(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado " + id + ", Tipo: "
					+ Categoria.class.getName());
		}
		return obj;
	}
}
