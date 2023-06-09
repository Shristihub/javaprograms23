package com.shristi.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InStreamsDemo {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Angular","Node","Spring","CSS","React");
		// convert to a stream
		Stream<String> courseStream = courses.stream();
		// call a terminal operator
		Iterator<String> it =courseStream.iterator();
		while (it.hasNext()) {
			String str =  it.next();
			System.out.println(str);
		}
		
		System.out.println();
		Arrays.asList("Java","Angular","Node","Spring","CSS","React","Html","Spring")
			.stream()
			.filter(str->str.length()>3)
			.forEach(str->System.out.println(str));
		
		
		System.out.println();
		Arrays.asList("Java","Angular","Node","Spring","CSS","React","Html","Spring")
			.stream()
			.filter(str->str.length()>3)
			.distinct()
			.map((str)->str.toUpperCase())
			.sorted()
			.limit(4)
			.skip(2)
			.forEach(str->System.out.println(str));	
		
		
		Arrays.asList("Java","Angular","Node","Spring","CSS","React","Html","Spring")
		.stream()
		.filter(str->str.length()>3)
		.distinct()
		.map((str)->str.length()) // i/p is string o/p is integer
		.forEach(str->System.out.println(str));	
		
		
		System.out.println();
		List<String> newcourses = Arrays.asList("Java","Angular","Node","Spring","CSS","React","Html","Spring")
		.stream()
		.filter(str->str.length()>3)
		.distinct()
		.map(String::toUpperCase).limit(3)
		.collect(Collectors.toList());
		
		newcourses.forEach((str)-> System.out.println(str));
		newcourses.forEach(System.out::println);
		
		// generate a stream
		Stream.generate(()->"Hello").limit(5)
				.forEach(System.out::println);
		
		//using Arrays
		Stream.of(10,15,16,78,67,56)
		   .filter(num-> num%2==0).forEach(System.out::println);
		
		
		
	}
	
	
	
	
	
	
}
