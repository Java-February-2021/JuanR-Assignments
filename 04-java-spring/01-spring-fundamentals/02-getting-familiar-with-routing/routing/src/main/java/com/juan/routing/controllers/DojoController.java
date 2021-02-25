package com.juan.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo")
	public String index(@RequestParam() String searchQuery) {
		return "The dojo is awesome!";
	}
	@RequestMapping("/dojo/burbank") 
	public String burbank(@RequestParam() String searchQuery) {
		return "Burbank Dojo is located in Southern California";
	}
	@RequestMapping("/dojo/san-jose")
	public String sj(@RequestParam() String searchQuery) {
		return "SJ dojo is the headquarters"; 
	}
}
