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

import com.example.demo.models.Produit;
import com.example.demo.services.interfaces.IProduitService;

@RestController
@RequestMapping("produits")
public class ProduitController {
	@Autowired
	private IProduitService service;

	@GetMapping()
	public List<Produit> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Produit findById(@PathVariable Long id) {
		return this.service.findById(id);
	}

	@PostMapping()
	public Produit save(@RequestBody Produit produit) {
		Produit NewProduit = produit;
		this.service.save(NewProduit);
		return NewProduit;
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
	public Produit update(@RequestBody Produit produit) {
		this.service.update(produit);
		return produit;
	}
}
