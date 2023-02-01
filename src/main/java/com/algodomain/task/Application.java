package com.algodomain.task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.algodomain.task.entity.CategoryInfo;
import com.algodomain.task.entity.Product;
import com.algodomain.task.service.CategoryInfoService;
import com.algodomain.task.service.ProductService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private CategoryInfoService categoryInfoService;
	
	@Autowired
	private ProductService productService;

	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RUNNING AS SOON AS SPRING BOOT APP STARTS");
//		List<CategoryInfo> categoryInfoList = new ArrayList<>();
//		categoryInfoList.add(new CategoryInfo("Electronics",15,18,350));
//		categoryInfoList.add(new CategoryInfo("Home Appliances",22,24,800));
//		categoryInfoList.add(new CategoryInfo("Clothing",40,12,0));
//		categoryInfoList.add(new CategoryInfo("Furniture",10,18,300));
//		categoryInfoService.saveAllCategory(categoryInfoList);
		
//		List<Product> productList = new ArrayList<>();
//		productList.add(new Product(1001, "Lenevo Yoga", "Laptop", "Electronics", 45000));
//		productList.add(new Product(1002, "LG Washing Machine", "Washing Machine", "Home Appliances", 25000));
//		productList.add(new Product(1003, "HP Pavillion 360", "Laptop", "Electronics", 60000));
//		productList.add(new Product(1004, "U S Polo Assn", "T-Shirt", "Clothing", 1200));
//		productList.add(new Product(1005, "Neelkamal Been Bag", "Sofa Set", "Furniture", 350));
		
//		productList.forEach(product -> productService.saveProduct(product));
	}

}
