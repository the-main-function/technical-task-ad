package com.algodomain.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.entity.CategoryInfo;
import com.algodomain.task.entity.Product;
import com.algodomain.task.exceptions.ResourceNotFoundException;
import com.algodomain.task.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CategoryInfoService categoryInfoService;
	
	@Autowired
	private ChargesService chargesService;
	
	public Product saveProduct(Product product) {
		
		CategoryInfo categoryInfo = categoryInfoService.getCategoryByName(product.getCategory());
		
		//setting categoryInfo
		
		product.setCategoryInfo(categoryInfo);
		
		//calculating and setting discount
		double discountAmount = categoryInfo.getDiscount()*product.getBasePrice()/100;
		product.setDiscount(discountAmount);
		
		//setting charges
		double gst = (product.getBasePrice() - discountAmount) * categoryInfo.getGst()/100;
		product.setCharges(chargesService.setCharges(product, gst, categoryInfoService.getCategoryByName(product.getCategory()).getDelivery()));
		
		//setting final price
		product.setFinalPrice(product.getBasePrice()-discountAmount+gst+categoryInfoService.getCategoryByName(product.getCategory()).getDelivery());
		
		return productRepo.save(product);
	}
	
	public Product getProduct(int productId) {
		return productRepo.findById(productId).orElseThrow(() -> new ResourceNotFoundException("product", "id", productId));
	}
	
	public void removeProduct(int productId) {
		productRepo.deleteById(productId);
	}
	
	public void updateProduct(Product product) {
		Product existingProduct = productRepo.findById(product.getProductId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setBasePrice(product.getBasePrice());
		existingProduct.setProductType(product.getProductType());
		saveProduct(existingProduct);
	}
}
