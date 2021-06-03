package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Categorie;
import com.example.demo.repositories.CategorieRepository;
import com.example.demo.services.interfaces.ICategorieService;

public class CategorieServiceImpl implements ICategorieService{

	@Autowired
	private CategorieRepository repository;
	
	@Override
	public List<Categorie> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Categorie findById(Long id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Categorie save(Categorie item) {
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
	public Categorie update(Categorie item) {
		return this.repository.save(item);
	}
}
