package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookapp.model.Book;

@Component
public class BookDetails {
	
	public List<Book> showBooks() {
		List<Book> books = Arrays.asList(
				new Book("Java", "Kathy","Tech", 1, 1900),
				new Book("Learn Java", "John","Tech", 2, 600),
				new Book("Head First Java", "Kathy","Tech", 2, 600),
				new Book("Life After Life", "Robert","Fiction", 3, 1200),
				new Book("Leadership", "Avinash", "Selfhelp", 4, 900), 
				new Book("Life After Death", "Selfhelp", "Deepak", 5, 900));
		return books;

}}
