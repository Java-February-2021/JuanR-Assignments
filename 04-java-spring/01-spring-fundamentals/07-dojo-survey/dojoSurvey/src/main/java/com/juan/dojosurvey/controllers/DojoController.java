package com.juan.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DojoController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/success")
	public String success() {
		return "success.jsp";
	}
	
	private String[] getLocations() {
		return new String[] {
			"Seattle", "San Francisco", "San Jose", 
		};
	}
	private String[] getLanguages() {
		return new String[] {
			 "Java", "Python", "C++"
		};
	}
	
	@RequestMapping("/")
	public String Index(Model model) {
		model.addAttribute("locations", getLocations());
		model.addAttribute("languages", getLanguages());
		return "index.jsp";
	}
}
