package com.soc.fun;

import java.util.Arrays;
import java.util.List;

interface BookDetails{
    Book getBook();	
}

class Book {
	public List<String> showBooks() {
		return Arrays.asList("Java","Spring");
	}
	
}
public class RefConstDemo {

	public static void main(String[] args) {
		// using Lambda implement
		BookDetails bookDetails = ()->{
			return new Book();
		};
		// call the method
		Book book = bookDetails.getBook();
		System.out.println(book.showBooks());
		
		// using the constructor as reference
		BookDetails bookDetails1 = Book::new;
		Book book1 = bookDetails1.getBook();
		System.out.println(book1.showBooks());
		

	}

}
