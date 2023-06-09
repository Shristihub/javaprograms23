package com.shristi.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatDemo {
	public static void main(String[] args) {
		
		String[] courses = new String[] {"Java","Angular","Node","Spring","CSS","React","Html","Spring"};
//		Stream<String> streamData =  Arrays.stream(courses);
//		streamData.map(str->str.toLowerCase()).forEach(System.out::println);
//		System.out.println();
		
		Arrays.stream(courses).map(str->str.toLowerCase()).forEach(System.out::println);
		System.out.println();
		// to work with two dim arrays
		String[][] twoCourses = new String[][] {{"Java","Angular"},{"Node","Spring"},{"Html","CSS"}};
		Stream<String[]> streamTwoArr =Arrays.stream(twoCourses);
		Stream<String> streamTwoData  = streamTwoArr.flatMap(oneDimArr->Arrays.stream(oneDimArr));
		streamTwoData.forEach(System.out::println);
		System.out.println();
			
		
		Arrays.stream(twoCourses)  // Stream<String[]>
				.flatMap(oneArr->Arrays.stream(oneArr)) //Stream<String>
				.map(String::toUpperCase)
				.forEach(System.out::println);
		
		
		
		
		
		
		
		}
	

}
