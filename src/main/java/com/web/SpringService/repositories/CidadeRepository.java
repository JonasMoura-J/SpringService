package com.web.SpringService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.SpringService.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Object>{
	
	@Query("SELECT a FROM Cidade a WHERE a.id = ?1")
	Cidade buscarPorId(Integer id);
}
