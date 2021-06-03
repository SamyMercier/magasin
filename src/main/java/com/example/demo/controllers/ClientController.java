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

import com.example.demo.models.Client;
import com.example.demo.services.interfaces.IClientService;

@RestController
@RequestMapping("clients")
public class ClientController {
	@Autowired
	private IClientService service;

	@GetMapping()
	public List<Client> findAll() {
		return this.service.findAll();
	}

	@GetMapping("{id}")
	public Client findById(@PathVariable Long id) {
		return this.service.findById(id);
	}

	@PostMapping()
	public Client save(@RequestBody Client client) {
		Client NewClient = client;
		this.service.save(NewClient);
		return NewClient;
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
	public Client update(@RequestBody Client client) {
		this.service.update(client);
		return client;
	}
}
