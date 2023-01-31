package com.algodomain.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "product_id")
	int productId;
	
	String name;
	
	@Column(name = "product_type")
	String productType;
	
	String category;
	
	@Column(name = "base_price")
	double basePrice;
	
	@OneToOne
	@JoinColumn(name="charge_id")
	Charges charges;
	
	@Column(name = "final_price")
	double finalPrice;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	Category categoryInfo;
		
}
