package com.web.SpringService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.SpringService.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Object>{
	@Query("SELECT a FROM Categoria a WHERE a.id = ?1")
	Categoria buscarPorId(Integer id);
}
