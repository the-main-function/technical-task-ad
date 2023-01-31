package com.algodomain.task.repo;

import org.springframework.data.repository.CrudRepository;

import com.algodomain.task.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
