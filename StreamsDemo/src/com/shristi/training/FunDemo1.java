package com.shristi.training;

import java.util.function.BiFunction;
import java.util.function.Function;


public class FunDemo1 {

	public static void main(String[] args) {
		
		Function<String, String> fun =(str)->str.toUpperCase();
		System.out.println(fun.apply("hello"));
		
		Function<String, Integer> fun1 =(str)->str.length();
		System.out.println(fun1.apply("hello"));
		
		// Book get the title of the book obje
		Function<Book, String> fun2 =(book)->book.getTitle().toUpperCase();
		System.out.println(fun2.apply(new Book("Java","Kathy",200,1)));
		
			
		
	}
}
