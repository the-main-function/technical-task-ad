package com.algodomain.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	int categoryId;
	
	String name;
	
	double discount;
	
	double gst;
	
	double delivery;
	
	public CategoryInfo() {
		super();
	}
	
	public CategoryInfo(String name, double discount, double gst, double delivery) {
		super();
		this.name = name;
		this.discount = discount;
		this.gst = gst;
		this.delivery = delivery;
	}

	public CategoryInfo(int categoryId) {
		super();
		this.categoryId = categoryId;
	}
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getDelivery() {
		return delivery;
	}

	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}	
	
}
