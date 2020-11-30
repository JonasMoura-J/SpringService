package com.web.SpringService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.SpringService.domain.Categoria;
import com.web.SpringService.repositories.CategoriaRepository;

@SpringBootApplication
public class SpringServiceApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository catRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		catRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
