package com.shristi.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunDemo {

	public static void main(String[] args) {
		
		//implementation
		Consumer<String> con = (val)->System.out.println(val.toUpperCase());
		// call the method
		con.accept("Hello");
		
		Consumer<Integer> con1 = (num)->System.out.println(Math.pow(num, 2));
		con1.accept(100);
		
		BiConsumer<Integer, Integer> bicon =(num1,num2)-> System.out.println(num1+num2);
		bicon.accept(100, 200);
		
		// print the book object using Consumer
		Consumer<Book> conBook = book->System.out.println(book);
		conBook.accept(new Book("Java","Kathy",200,1));
		System.out.println();
		//pass Integer and List<Book> to search and get one book
		BiConsumer<Integer,List<Book>> conBook1 = (bookId,bookList)->{
			for (Book book : bookList) {
				if(bookId==book.getBookId())
					System.out.println(book);
			}
		};
		conBook1.accept(1,Arrays.asList(new Book("Java","Kathy",200,1),new Book("Java","Kathy",200,2)));
		
//		IntConsumer
		Consumer<String> con8 = (val)->{
			Predicate<String> pr = (val1)->{
				if(val1.length()>5) {
					return true;
				}
				return false;
			};
			if(pr.test(val))				
				System.out.println(val.toUpperCase());
			else
				System.out.println(val.toLowerCase());
		};
		con8.accept("Gr");
		
		Supplier<String> sup  = ()->"Great";
		System.out.println(sup.get());
		
		Supplier<Book> sup1  = ()->new Book("Java","Kathy",200,1);
		System.out.println(sup1.get());
		
		Predicate<String> pred = (str)->str.length()>5;
		System.out.println(pred.test("welcome"));
		
		BiPredicate<Integer,String> pred1 = (num,str)->str.length()>num;
		System.out.println(pred1.test(7,"welcome"));
		
		
		
		
		
		
	}
}
