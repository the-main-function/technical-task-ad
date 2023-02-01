package com.algodomain.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.task.entity.Product;
import com.algodomain.task.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product) {
		productService.saveProduct(product);
	}
	
	@GetMapping("/products/{productId}")
	public Product getProducts(@PathVariable int productId){
		return productService.getProduct(productId);
	}
	
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		productService.removeProduct(productId);
	}
	
	@PutMapping("/product")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
}
