package com.shristi.streams;

import java.util.Arrays;
import java.util.stream.Stream;

import com.shristi.training.Book;

public class TakeDemo {
	public static void main(String[] args) {
//		Stream.of("Java","Angular","Html","Node","Spring")
//		.takeWhile(str->!str.equals("Node"))
//		.forEach(System.out::println);
//		
//		System.out.println();
//		Stream.of("Java","Angular","Html","Node","Spring")
//		.dropWhile(str->!str.equals("Node"))
//		.forEach(System.out::println);
		
		Arrays.asList(new Book("Java","Kathy",200,1),
				new Book("Spring","John",200,2),
				new Book("Node","Kathy",200,3),
				new Book("Angular","Kathy",200,4))
	 .stream()
	 .takeWhile(book->!book.getTitle().equals("Node"))
	 .forEach(System.out::println);		
	}

}
