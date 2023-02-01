package com.algodomain.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.task.entity.Product;
import com.algodomain.task.service.ProductService;
import com.algodomain.task.utils.ApiResponse;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return ResponseEntity.ok(productService.saveProduct(product));
	}
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> getProducts(@PathVariable int productId){
		return ResponseEntity.ok(productService.getProduct(productId));
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<ApiResponse> deleteProduct(@PathVariable int productId) {
		productService.removeProduct(productId);
		return ResponseEntity.ok(new ApiResponse("product with id : " + productId + "deleted", true));
	}
	
	@PutMapping("/product")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		return ResponseEntity.ok(productService.updateProduct(product));
	}
}
