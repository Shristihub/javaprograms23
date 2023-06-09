package com.shristi.streams;

import java.util.Arrays;
import java.util.Optional;

public class OptionDemo {

	public static void main(String[] args) {
		Optional<String> optStr = 
				Arrays.asList("Java","Angular","Node","Spring")
			.stream() 
			.filter(str->str.length()>10)
			.findFirst();
		
//		System.out.println(optStr.get());
		if(optStr.isPresent())
			System.out.println(optStr.get());
		
		if(optStr.isEmpty()) {
			String sub = optStr.orElse("no data");
			System.out.println(sub);
		}
		optStr.ifPresent(System.out::println);
		optStr.ifPresentOrElse(System.out::println, ()->System.out.println("No data available"));
		
		String res = optStr.orElseGet(()->"Invalid Data".toUpperCase());
		System.out.println(res);
		
		
		
	}

}
