package com.shristi.streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReduceDemo {
	public static void main(String[] args) {
//		IntBinaryOperator
		OptionalInt opt =  Arrays.asList("100","200","300")
		.stream()
		.mapToInt(str->Integer.parseInt(str))
		.reduce((x,y)->x+y);
		opt.ifPresent(System.out::println);
		
	}

}
