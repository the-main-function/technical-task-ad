package com.algodomain.task.repo;

import org.springframework.data.repository.CrudRepository;

import com.algodomain.task.entity.CategoryInfo;

public interface CategoryInfoRepository extends CrudRepository<CategoryInfo, Integer> {
	
	public CategoryInfo getCategoryInfoByName(String name);
}
