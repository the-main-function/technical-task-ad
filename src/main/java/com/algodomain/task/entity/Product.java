package com.algodomain.task.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	int productId;
	
	String name;
	
	String productType;
	
	String category;
	
	double basePrice;
	
		
}
