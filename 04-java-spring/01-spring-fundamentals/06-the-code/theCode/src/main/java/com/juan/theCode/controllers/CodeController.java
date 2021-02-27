package com.juan.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping
	private String attemptCode(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		String incorrect = "";
		if(code.equals("bushido")) {
			return "success.jsp";
			
		} else {
			incorrect = "You must train harder!";
			redirectAttributes.addFlashAttribute("incorrect", incorrect);
			return "redirect:/";
		}
	}
}
