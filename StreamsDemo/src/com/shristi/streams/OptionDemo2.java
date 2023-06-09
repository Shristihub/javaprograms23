package com.shristi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionDemo2 {

	public static void main(String[] args) {
		String res = Arrays.asList("Java","Angular","Node","Spring")
			.stream() 
			.filter(str->str.length()>10)
			.findFirst()
			.orElseGet(()->"no data");
		System.out.println(res);
		
		Optional<String> opt = Arrays.asList("Java","Angular","Node","Spring")
				.stream() 
				.filter(str->str.length()>1)
				.findFirst()
				.or(()->Optional.of("No data available"));

			System.out.println(opt.get());
			
			List<Optional<Integer>> optList = 
					Arrays.asList(
					      Optional.of(1),
					      Optional.empty(),
					      Optional.of(2),
					      Optional.empty());
			
			optList.stream().forEach((optId)->{
//				System.out.println(optId.get());	
				optId.ifPresentOrElse((id)->System.out.println(id),
									   ()->System.out.println("No employeeFound"));
				});
		
		
	}

}
