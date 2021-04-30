package com.web.SpringService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.SpringService.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Object>{
	
	@Query("SELECT a FROM Estado a WHERE a.id = ?1")
	Estado buscarPorId(Integer id);
}
