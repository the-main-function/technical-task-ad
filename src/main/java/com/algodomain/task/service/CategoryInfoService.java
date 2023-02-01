package com.algodomain.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.entity.CategoryInfo;
import com.algodomain.task.repo.CategoryInfoRepository;

@Service
public class CategoryInfoService {

	@Autowired
	private CategoryInfoRepository categoryInfoRepo;
	
	public CategoryInfo saveCategory(CategoryInfo category) {
		return categoryInfoRepo.save(category);
	}
		
	public CategoryInfo getCategoryByName(String name) {
		return categoryInfoRepo.getCategoryInfoByName(name);
	}
	
}
