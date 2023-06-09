package com.soc.fun;

public class AnonyDemo {

	public static void main(String[] args) {
		Greeter greeter = new GreeterImpl();
		greeter.greetUser("Priya");
		
		// anonymous class
		// implementation of the method
		Greeter greeterOne = new Greeter() {

			@Override
			public void greetUser(String username) {
				System.out.println("Hello "+username);
			}			
		};
		greeterOne.greetUser("Sri");
		
		Greeter greetTwo = new Greeter() {
			
			@Override
			public void greetUser(String username) {
				System.out.println("Welcome "+username);
				
			}
		};
		greetTwo.greetUser("Sri");
	
	}
}
