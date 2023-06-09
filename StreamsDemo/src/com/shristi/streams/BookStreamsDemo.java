package com.shristi.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.shristi.training.Book;

public class BookStreamsDemo {

	public static void main(String[] args) {

		//create a list of Books-> convert to stream-> get books by author -> print
		Arrays.asList(new Book("Java","Kathy",200,1),
						new Book("Spring","John",200,2),
						new Book("Node","Kathy",200,3),
						new Book("Angular","Kathy",200,4))
			 .stream()
			 .filter(book->book.getAuthor().equals("Kathy"))
			 .sorted((b1,b2)->b1.getTitle().compareTo(b2.getTitle()))
			 .forEach(System.out::println);
		
		
		Arrays.asList(new Book("Java","Kathy",200,1),
				new Book("Spring","John",200,2),
				new Book("Node","Kathy",200,3),
				new Book("Angular","Kathy",200,4))
	 .stream()
	 .filter(book->book.getAuthor().equals("Kathy"))
//	 .sorted(Comparator.comparing(book->{
//		 return book.getTitle();
//	 }))
	 .sorted(Comparator.comparing(Book::getTitle))
	 .forEach(System.out::println);
		
		
		//create a list of Books-> 
		//convert to stream-> 
		//get books by author ->
		// retrieve only the title map
		// sort 
		//and convert to a list
		
		List<String> bookTitles = Arrays.asList(new Book("Java","Kathy",200,1),
				new Book("Spring","John",200,2),
				new Book("Node","Kathy",200,3),
				new Book("Angular","Kathy",200,4))
		.stream()
		.filter(book->book.getAuthor().equals("Kathy"))
		.map(book->book.getTitle())
		.sorted()
		.collect(Collectors.toUnmodifiableList());
//		bookTitles.add("Leadership"); // exception
		System.out.println(bookTitles);
		
		Arrays.asList(new Book("Java","Kathy",200,1),
				new Book("Spring","John",200,2),
				new Book("Node","Kathy",200,3),
				new Book("Angular","Kathy",200,4))
		.stream()
		.filter(book->book.getBookId()==2)
		.findFirst()
		.ifPresent(System.out::println);
		
		
	}

}
