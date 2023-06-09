package com.soc.fun;


@FunctionalInterface
public interface Checker {

	boolean checkName(String username, String city);
	// private methods
	private void call() {
		System.out.println("Hello");
	}
	default void show() {
		System.out.println("Great Day");
		call();
	}
	
}

interface Printer{
	String  print();
}
