package com.juan.displayDate.controllers;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
				
	}
	
	@GetMapping("/date")
	public String date() {
		LocalDateTime now = LocalDateTime.now();
		return "date.jsp";
	}
	
	
	@GetMapping("/time")
	public String time() {
		LocalDateTime now = LocalDateTime.now();
		LocalTime lT = LocalTime.now();
		System.out.println(lT);
		return "time.jsp";	
	}
}
