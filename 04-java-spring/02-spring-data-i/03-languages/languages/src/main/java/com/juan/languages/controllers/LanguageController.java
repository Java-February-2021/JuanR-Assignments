package com.juan.languages.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.juan.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService sService;
	
	@PostMapping("/addLanguage") 
	public String newLanguage(@RequestParam("name") String name, @RequestParam("creator")String creator, @RequestParam("version")int version) {
		this.sService.createLanguage(name, creator, version);
		return "redirect:/";
	}
}
