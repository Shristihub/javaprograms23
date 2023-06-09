package com.soc.training;

public interface Calculator {

	void add(int x, int y);
	void product(int x, int y);
	
	default void cube(int x) {
		System.out.println(x*3);
	}
}
