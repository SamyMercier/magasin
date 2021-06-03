package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

	public List<Commande> findByClientId (Long idClient);

}
