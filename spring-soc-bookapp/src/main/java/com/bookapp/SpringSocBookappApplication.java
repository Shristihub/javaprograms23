package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringSocBookappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringSocBookappApplication.class, args);
	}
	@Autowired
	private IBookService bookService;
	
	@Override
	public void run(String... args) throws Exception {
		bookService.getByCategory("Tech").forEach(System.out::println);
		
		Book book = bookService.getById(1);
		System.out.println(book);
		
	}

}
