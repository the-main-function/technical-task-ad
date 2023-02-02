package com.algodomain.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.task.entity.CategoryInfo;
import com.algodomain.task.repo.CategoryInfoRepository;

@Service
public class CategoryInfoService {

	@Autowired
	private CategoryInfoRepository categoryInfoRepo;
	
	public boolean ifCategoryExists(CategoryInfo categoryInfo) {
		return categoryInfoRepo.existsById(categoryInfo.getCategoryId());
	}
	
	public CategoryInfo saveCategory(CategoryInfo categoryInfo) {
		return categoryInfoRepo.save(categoryInfo);
	}
		
	public CategoryInfo getCategoryByName(String name) {
		return categoryInfoRepo.getCategoryInfoByName(name);
	}
	
	public Iterable<CategoryInfo> saveAllCategory(List<CategoryInfo> categoryInfoList) {
		return categoryInfoRepo.saveAll(categoryInfoList);
	}
	
	public Iterable<CategoryInfo> getAllCategory(){
		return categoryInfoRepo.findAll();
		
	}
	
}
