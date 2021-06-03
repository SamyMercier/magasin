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

import com.example.demo.models.Commande;
import com.example.demo.services.interfaces.ICommandeService;

@RestController
@RequestMapping("commandes")
public class CommandeController {

	@Autowired
	private ICommandeService service;

	@GetMapping("/client/{id}")
	public List<Commande> findByClientId(@PathVariable Long id) {
		return this.service.findByClientId(id);
	}
	
	@GetMapping()
	public List<Commande> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Commande findById(@PathVariable Long id) {
		return this.service.findById(id);
	}

	@PostMapping()
	public Commande save(@RequestBody Commande commande) {
		Commande NewCommande = commande;
		this.service.save(NewCommande);
		return NewCommande;
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
	public Commande update(@RequestBody Commande commande) {
		this.service.update(commande);
		return commande;
	}
}
