package com.web.SpringService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.SpringService.domain.Categoria;
import com.web.SpringService.repositories.CategoriaRepository;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	@RequestMapping(value="/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id){
		
		Categoria obj = repository.findById(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
