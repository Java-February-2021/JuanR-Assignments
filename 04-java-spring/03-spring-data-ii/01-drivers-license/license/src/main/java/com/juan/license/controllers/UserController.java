package com.juan.license.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.license.models.User;
import com.juan.license.services.LicenseService;
import com.juan.license.services.UserService;

@Controller
@RequestMapping("/persons/new")
public class UserController {
	@Autowired
	private UserService uService;
	@Autowired
	private LicenseService lService;
	
	@GetMapping("")
	public String index(@Valid @ModelAttribute("user")User user, BindingResult result) {
		return "index.jsp";
	}
	
}
