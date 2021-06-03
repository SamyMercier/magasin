package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.services.impl.CategorieServiceImpl;
import com.example.demo.services.impl.ClientServiceImpl;
import com.example.demo.services.impl.CommandeServiceImpl;
import com.example.demo.services.impl.ProduitServiceImpl;
import com.example.demo.services.interfaces.ICategorieService;
import com.example.demo.services.interfaces.IClientService;
import com.example.demo.services.interfaces.ICommandeService;
import com.example.demo.services.interfaces.IProduitService;



@Configuration
public class ServiceConfig {
	
	@Bean
	public ICategorieService categorieServiceFactory() {
		return new CategorieServiceImpl();
	}
	
	@Bean
	public IClientService clientServiceFactory() {
		return new ClientServiceImpl();
	}
	
	@Bean
	public ICommandeService commandeServiceFactory() {
		return new CommandeServiceImpl();
	}
	
	@Bean
	public IProduitService produitServiceFactory() {
		return new ProduitServiceImpl();
	}
}
