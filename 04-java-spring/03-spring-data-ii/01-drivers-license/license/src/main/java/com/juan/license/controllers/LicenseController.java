package com.juan.license.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.license.models.User;
import com.juan.license.services.LicenseService;
import com.juan.license.services.UserService;

@Controller
@RequestMapping("/licenses/new")
public class LicenseController {
	@Autowired
	private UserService uService;
	@Autowired
	private LicenseService lService;
	
	
	@PostMapping("")
	public String newLicense(@ModelAttribute("user")User user, BindingResult result) {
		this.uService.createUser(user);
		return "newLicense.jsp";
	}
}
