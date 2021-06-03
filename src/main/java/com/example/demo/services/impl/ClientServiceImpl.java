package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Client;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.services.interfaces.IClientService;

public class ClientServiceImpl implements IClientService{

	@Autowired
	private ClientRepository repository;
	
	@Override
	public List<Client> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Client findById(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Client save(Client item) {
		return this.repository.save(item);
	}

	@Override
	public void deleteById(Long id) {
		this.repository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		this.repository.deleteAll();
	}

	@Override
	public Client update(Client item) {
		return this.repository.save(item);
	}

	
}
