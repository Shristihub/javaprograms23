package com.shristi.streams;

import java.util.stream.IntStream;

public class ParallelDemo {

	public static void main(String[] args) {
System.out.println("In Normal");  
        
        // prints values from 1 to 5 (1 and 5 included)  
        IntStream r = IntStream.rangeClosed(1, 5);  
        r.forEach(System.out::println);  
  
        System.out.println("In Parallel");  
  
        // prints values from 1 to 5 (1 and 5 included)  
        IntStream r1 = IntStream.rangeClosed(1, 5);  
        r1.parallel().forEach(System.out::println);  
	}

}
