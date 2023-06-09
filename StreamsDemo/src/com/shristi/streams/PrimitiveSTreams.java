package com.shristi.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveSTreams {
	public static void main(String[] args) {
		int total = Arrays.asList("Java","Angular","Node","Spring","CSS","React","Html","Spring")
		.stream()
		.filter(str->str.length()>3)
		.mapToInt(str->str.length())
		.sum();
		System.out.println(total);
		
		Arrays.asList("100","200","300")
		.stream()
		.mapToInt(str->Integer.parseInt(str))
		.average().ifPresent(System.out::println);
		System.out.println(total);
		System.out.println();
		int sum = IntStream.range(10, 15).sum();
		System.out.println(sum);
		System.out.println();
		LongStream.of(900,800,700).forEach(System.out::println);
		
		
		
		
		
	}

}
