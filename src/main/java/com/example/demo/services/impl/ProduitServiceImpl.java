package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Produit;
import com.example.demo.repositories.ProduitRepository;
import com.example.demo.services.interfaces.IProduitService;


public class ProduitServiceImpl implements IProduitService{

	
	@Autowired
	private ProduitRepository repository;
	
	@Override
	public List<Produit> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Produit findById(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Produit save(Produit item) {
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
	public Produit update(Produit item) {
		return this.repository.save(item);
	}
}
