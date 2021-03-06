package com.juan.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.languages.models.Language;
import com.juan.languages.services.LanguageService;

@RestController
@RequestMapping("/languages")
public class HomeController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("")
	public List<Language> index() {
		return this.lService.getAllLanguages();
	}
	
}
