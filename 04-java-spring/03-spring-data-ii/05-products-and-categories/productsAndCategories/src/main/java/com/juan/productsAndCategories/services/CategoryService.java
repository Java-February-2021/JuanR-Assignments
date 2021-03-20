package com.juan.productsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.productsAndCategories.models.Category;
import com.juan.productsAndCategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository cRepo;
	
	public CategoryService(CategoryRepository repo) {
		this.cRepo = repo;
	}
	// Get All
	public List<Category> getAllCategories() {
		return this.cRepo.findAll();
	}
	// Get One
	public Category getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	// Create Category
	public Category createCategory(Category newCategory) {
		return this.cRepo.save(newCategory);
	}
}
