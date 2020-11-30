package com.web.SpringService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.web.SpringService.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Object>{
	Categoria findById(Integer Id);
}
