package com.juan.productsAndCategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.productsAndCategories.models.Product;

@Controller
@RequestMapping("/products/new")
public class ProductController {
	@GetMapping("")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
}
