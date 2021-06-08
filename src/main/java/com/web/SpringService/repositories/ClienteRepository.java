package com.web.SpringService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.SpringService.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	@Query("SELECT a FROM Cliente a WHERE a.id = ?1")
	Cliente buscarPorId(Integer id);
}
