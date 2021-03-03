package com.juan.show.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.show.models.Book;
import com.juan.show.repositions.BookRepository;

@Service
public class BookService {
	// Injects book repository
	private BookRepository bRepo;
	
	public BookService(BookRepository bookRepository) {
		this.bRepo = bookRepository;
	}

	// Retrieve all Books
	public List<Book> getAllBooks() {
		return  this.bRepo.findAll();
	}
	
	// Create
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
	
	// Read
	public Book getSingleBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
}
