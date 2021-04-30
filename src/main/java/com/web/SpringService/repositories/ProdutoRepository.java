package com.web.SpringService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.SpringService.domain.Categoria;
import com.web.SpringService.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Object>{
	
	Categoria findById(Integer Id);
}
