package com.shristi.nine;

import java.util.stream.Stream;

public class TakeDemo {

	public static void main(String[] args) {
		
		System.out.println("Prints till the blank line- exclusive");
		//Java, Angular
		Stream.of("Java", "Angular", "Node", "Spring", "React")
			.takeWhile(s -> !s.equals("Node")).forEach(System.out::println);
		
		System.out.println("Starts after the blank line- inclusive");
		//" ", Node,Spring,React
		Stream.of("Java", "Angular", " ", "Node", "Spring", "React")
		.dropWhile(s -> !s.isBlank()).forEach(System.out::println);
		
		//1,2 ,3
		Stream.of(1,2,3,4,5,6).takeWhile(i->i<4).forEach(System.out::println);
		System.out.println();
		//4,5,6
		Stream.of(1,2,3,4,5,6).dropWhile(i->i<4).forEach(System.out::println);
	}
}

