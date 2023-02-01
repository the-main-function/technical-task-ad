package com.algodomain.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.entity.Product;
import com.algodomain.task.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CategoryInfoService categoryInfoService;
	
	public Product saveProduct(Product product) {
		product.setCategoryInfo(categoryInfoService.getCategoryByName(product.getCategory()));
		return productRepo.save(product);
	}
}
