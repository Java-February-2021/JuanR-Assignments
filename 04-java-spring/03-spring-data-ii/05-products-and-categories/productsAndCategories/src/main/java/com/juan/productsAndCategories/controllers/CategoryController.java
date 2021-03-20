package com.juan.productsAndCategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.productsAndCategories.models.Category;

@Controller
@RequestMapping("/categories/new")
public class CategoryController {
	@GetMapping("")
	public String addCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
}
