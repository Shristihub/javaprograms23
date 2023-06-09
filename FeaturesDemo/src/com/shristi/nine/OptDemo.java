package com.shristi.nine;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptDemo {

	public static void main(String[] args) {
		//using ifPresentOrElse
		Optional<String> nopt = Optional.empty();
		nopt.ifPresentOrElse(System.out::println, 
				    ()->System.out.println("No data"));
		
		Optional<String> opt = Optional.empty();
		// returns an Optional using Supplier
		Optional<String> opt2 = opt.or(()->Optional.of("No data"));
		System.out.println(opt2.get()); // no data
		
		Optional<String> opt1 = Optional.of("Hello");
		Optional<String> opt3 = opt1.or(()->Optional.of("No data"));
		System.out.println(opt3.get()); // Hello
		
		//using or method
		Optional<String> opt5 = Arrays.asList("Java","Angular","Node","Spring")
				.stream() 
				.filter(str->str.length()>1)
				.findFirst()
				.or(()->Optional.of("No data available"));

			System.out.println(opt5.get());
		
		
		//Stream<Optional<String>>
		List<Optional<Integer>> optList = 
				Arrays.asList(
				      Optional.of(1),
				      Optional.empty(),
				      Optional.of(2),
				      Optional.empty());
		
		optList.stream().forEach((optId)->{
//			System.out.println(optId.get());	
			optId.ifPresentOrElse((id)->System.out.println(id),
								   ()->System.out.println("No employeeFound"));
			});

	}

}
