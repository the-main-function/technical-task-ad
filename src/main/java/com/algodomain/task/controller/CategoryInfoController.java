package com.algodomain.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.task.entity.CategoryInfo;
import com.algodomain.task.exceptions.ResourceExistsException;
import com.algodomain.task.service.CategoryInfoService;

@RestController
public class CategoryInfoController {

	@Autowired
	private CategoryInfoService categoryInfoService;
	
	@PostMapping("/category")
	public ResponseEntity<CategoryInfo> addCategory(@RequestBody CategoryInfo categoryInfo) {
		if(categoryInfoService.ifCategoryExists(categoryInfo)) {
			throw new ResourceExistsException("category","id",categoryInfo.getCategoryId());
		}
		return new ResponseEntity<>(categoryInfoService.saveCategory(categoryInfo),HttpStatus.CREATED);
	}
}
