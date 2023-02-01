package com.algodomain.task.repo;

import org.springframework.data.repository.CrudRepository;

import com.algodomain.task.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	
}
