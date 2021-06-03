package com.example.demo.services;

import java.util.List;

public interface GenericService<T> {
	
	public List<T> findAll();

	public T findById(Long id);

	public T save(T item);

	public void deleteById(Long id);

	public void deleteAll();

	public T update(T item);
	
}
