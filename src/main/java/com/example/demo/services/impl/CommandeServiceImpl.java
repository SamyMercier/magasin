package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Commande;
import com.example.demo.repositories.CommandeRepository;
import com.example.demo.services.interfaces.ICommandeService;

public class CommandeServiceImpl implements ICommandeService{

	@Autowired
	private CommandeRepository repository;
	
	@Override
	public List<Commande> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Commande findById(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Commande save(Commande item) {
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
	public Commande update(Commande item) {
		return this.repository.save(item);
	}
}
