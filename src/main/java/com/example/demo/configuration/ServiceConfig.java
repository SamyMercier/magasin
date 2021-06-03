package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.services.impl.CategorieServiceImpl;
import com.example.demo.services.interfaces.ICategorieService;



@Configuration
public class ServiceConfig {
	
	@Bean
	public ICategorieService categorieServiceFactory() {
		return new CategorieServiceImpl();
	}
	
}
