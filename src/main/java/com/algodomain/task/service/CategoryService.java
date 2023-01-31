package com.algodomain.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.entity.Category;
import com.algodomain.task.repo.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	public Category saveCategory(Category category) {
		return categoryRepo.save(category);
	}
}
