package com.example.demo.services.interfaces;

import java.util.List;

import com.example.demo.models.Commande;
import com.example.demo.services.GenericService;

public interface ICommandeService extends GenericService<Commande> {

	public List<Commande> findByClientId(Long idClient);
}
