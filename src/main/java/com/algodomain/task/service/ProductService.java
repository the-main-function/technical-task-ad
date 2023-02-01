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
	
	@Autowired
	private ChargesService chargesService;
	
	public Product saveProduct(Product product) {
		//setting categoryInfo
		product.setCategoryInfo(categoryInfoService.getCategoryByName(product.getCategory()));
		
		//calculating and setting discount
		double discount = calculateDiscountAmount(categoryInfoService.getCategoryByName(product.getCategory()).getDiscount(), product.getBasePrice());
		product.setDiscount(discount);
		
		//setting charges
		double gst = (product.getBasePrice() - discount) * categoryInfoService.getCategoryByName(product.getCategory()).getGst();
		product.setCharges(chargesService.setCharges(product, gst, categoryInfoService.getCategoryByName(product.getCategory()).getDelivery()));
		
		//setting final price
		product.setFinalPrice(product.getBasePrice()-discount+gst+categoryInfoService.getCategoryByName(product.getCategory()).getDelivery());
		
		return productRepo.save(product);
	}
	
	public double calculateDiscountAmount(double discountPercentage, double basePrice) {
		return discountPercentage*basePrice;
	}
	
	public Product getProduct(int productId) {
		return productRepo.findById(productId).get();
	}
}