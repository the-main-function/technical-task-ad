package com.algodomain.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.task.entity.CategoryInfo;
import com.algodomain.task.service.CategoryInfoService;

@RestController
public class CategoryInfoController {

	@Autowired
	private CategoryInfoService categoryInfoService;
	
	@PostMapping("/category")
	public void addCategory(@RequestBody CategoryInfo category) {
		System.out.println(category);
		categoryInfoService.saveCategory(category);
		
	}
}
