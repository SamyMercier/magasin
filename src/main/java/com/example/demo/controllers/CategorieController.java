package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Categorie;
import com.example.demo.services.interfaces.ICategorieService;

@RestController
@RequestMapping("categories")
public class CategorieController {

	@Autowired
	private ICategorieService service;

	@GetMapping()
	public List<Categorie> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Categorie findById(@PathVariable Long id) {
		return this.service.findById(id);
	}

	@PostMapping()
	public Categorie save(@RequestBody Categorie categorie) {
		Categorie NewCategorie = categorie;
		this.service.save(NewCategorie);
		return NewCategorie;
	}

	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		this.service.deleteById(id);
	}

	@DeleteMapping()
	public void deleteAll() {
		this.service.deleteAll();
	}

	@PatchMapping("{id}")
	public Categorie update(@RequestBody Categorie categorie) {
		this.service.update(categorie);
		return categorie;
	}
}
