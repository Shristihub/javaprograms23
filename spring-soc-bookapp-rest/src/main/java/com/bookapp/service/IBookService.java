package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
	List<Book> getAll();
	Book getById(int bookId) throws BookNotFoundException;
	List<Book> getByCategory(String category);
	List<Book> getByPriceLessThan(double price);
	List<Book> getByTitleContaining(String title ) throws BookNotFoundException;
	List<Book> getByAuthorStarting(String author);
}
