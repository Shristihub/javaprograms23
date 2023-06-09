package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@RestController
@RequestMapping("/book-api")
public class BookController {
	@Autowired
	private IBookService bookService;
	
//	http://localhost:8080/book-api/books
	@GetMapping("/books")
	public List<Book> getAll(){
		return bookService.getAll();
		
	}
//	http://localhost:8080/book-api/books/bookId/1
	@GetMapping("/books/bookId/{bookId}")
	Book getById(@PathVariable("bookId") int bookId) {
		return bookService.getById(bookId);
	}
	
//	http://localhost:8080/book-api/books/category/Tech
	@GetMapping("/books/category/{category}")
	List<Book> getByCategory(@PathVariable("category") String category){
		return bookService.getByCategory(category);
	}
	
//	http://localhost:8080/book-api/books/price/2000
	@GetMapping("/books/price/{price}")
	List<Book> getByPriceLessThan(@PathVariable("price") double price){
		return bookService.getByPriceLessThan(price);
	}
	
//	http://localhost:8080/book-api/books/title?mtitle=Java
	@GetMapping("/books/title")
	List<Book> getByTitleContaining(@RequestParam("mtitle") String title ) {
		return bookService.getByTitleContaining(title);
	}
	
//	http://localhost:8080/book-api/books/author?author=K
	@GetMapping("/books/author")
	List<Book> getByAuthorStarting(@RequestParam("author")String author){
		return bookService.getByAuthorStarting(author);
	}
}
