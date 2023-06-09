package com.shristi.streams;

import java.util.Arrays;
import java.util.Optional;

public class OptionDemo1 {

	public static void main(String[] args) {
		String res = Arrays.asList("Java","Angular","Node","Spring")
			.stream() 
			.filter(str->str.length()>10)
			.findFirst()
			.orElse("No data");
		
		System.out.println(res);
		
		String res1 = Arrays.asList("Java","Angular","Node","Spring")
		.stream() 
		.filter(str->str.length()>10)
		.findFirst()
		.orElseThrow(()-> new ArithmeticException("No value"));
		System.out.println(res1);
		
		String res2 = Arrays.asList("Java","Angular","Node","Spring")
				.stream() 
				.filter(str->str.length()>10)
				.findFirst()
				.orElseThrow();
				System.out.println(res1);
				
		
	}

}
