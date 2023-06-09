package com.shristi.nine;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IterateDemo {
	public static void main(String[] args) {
		
//      syntax
//		Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)

//		for (int index=seed; hasNext.test(index); index = next.applyAsInt(index)) {}

		// initial value- seed,condt using predicate,increment using UnaryOperator
		IntStream.iterate(10,x->x<100,x->x+10).forEach(System.out::println);
		
		Stream.of(null).forEach(System.out::println);
	}

}
