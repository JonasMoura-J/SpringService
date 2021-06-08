package com.web.SpringService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.SpringService.domain.Cliente;
import com.web.SpringService.repositories.ClienteRepository;
import com.web.SpringService.service.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente buscar(Integer id) {
		Cliente obj = repository.buscarPorId(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado " + id + ", Tipo: "
					+ Cliente.class.getName());
		}
		return obj;
	}
}
