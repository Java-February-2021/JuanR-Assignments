package com.juan.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	@GetMapping("/")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	@GetMapping("/counter")
	public String counter(HttpSession session) {
		return "counter.jsp";
	}
	
	private int sessionCount(HttpSession session) {
		Object sessionCounter = session.getAttribute("counter");
		if(sessionCounter == null) {
			setSessionCounter(session, 0);
			sessionCounter = session.getAttribute("counter");
		}
		return (Integer)sessionCounter;
	}
	private void setSessionCounter(HttpSession session, int val) {
		session.setAttribute("counter", val);
	}
}
