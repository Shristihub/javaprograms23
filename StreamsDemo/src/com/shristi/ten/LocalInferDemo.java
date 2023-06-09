package com.shristi.ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Book{}
public class LocalInferDemo {
	
	public static String greet() {
		return "hello";
	}
	public static void main(String[] args) {

		// Example
		// inferred value for List
		var numbers = List.of(1, 2, 3, 4, 5); 
		
		// in for each loop
		for (var number : numbers) {
			System.out.println(number);
		}
		// in for loop for index
		for (var i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// Ok. But not a good idea
		var result = greet();// dont know the return type
		// no var in streams
		var res = Arrays.asList("Ram","Raj")
				.stream()
				.findFirst().map(String::length)
				.orElse(0);
		// this becomes a ArrayList<Object> not book
		var bookList = new ArrayList<>();
		var books = new ArrayList<Book>(); //ok
		
//		Illegal Declaration
//		var num; // should be initialized
//		var myList = null; // should be initialized
//		public var name = "Sri"; // cannot use on public variables
//		var con = (num)->{} ;// lambda needs explicit target type
//		var myarr = {1,2,3,4}; // array needs explicit target type
	
	}

}
