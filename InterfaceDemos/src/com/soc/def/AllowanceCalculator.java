package com.soc.def;

public interface AllowanceCalculator {
	void calculate(int amount);
	default void greet(String name){
		  System.out.println("welcome"+name);
	}
}
