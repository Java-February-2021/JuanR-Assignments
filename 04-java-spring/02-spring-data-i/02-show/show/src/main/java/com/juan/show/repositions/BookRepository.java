package com.juan.show.repositions;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.juan.show.models.Book;

public interface BookRepository extends CrudRepository <Book, Long>{
List<Book> findAll(); 
}
