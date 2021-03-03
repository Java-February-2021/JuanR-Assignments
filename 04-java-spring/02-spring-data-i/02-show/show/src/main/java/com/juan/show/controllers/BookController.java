package com.juan.show.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.juan.show.models.Book;
import com.juan.show.services.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bService;
	
	
	
	@GetMapping("/")
	public String index(Model viewModel, HttpSession session) {
		List<Book> allBooks = this.bService.getAllBooks();
		viewModel.addAttribute("allBooks", allBooks);
		return "index.jsp";	
	}
	
	@PostMapping("/new")
	public String addBook(@ModelAttribute("name")Book book) {
		return "new.jsp";
	}
	
}
