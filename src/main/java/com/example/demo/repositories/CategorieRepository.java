package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
