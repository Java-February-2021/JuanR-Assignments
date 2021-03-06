package com.juan.show.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.show.models.Book;
import com.juan.show.services.BookService;

@RestController
@RequestMapping("/books")
public class BooksApi {
	@Autowired
	private BookService bService;
	
	// Update Book
	@PutMapping("/update/{id}")
	public Book edit(@PathVariable("id") Long id, Book updatedBook) {
		return this.bService.updateBook(updatedBook);
	}
	
	// Delete Book
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable("id")Long id) {
		this.bService.deleteBook(id);
	}
}
