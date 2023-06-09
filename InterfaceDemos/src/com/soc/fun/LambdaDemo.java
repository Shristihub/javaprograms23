package com.soc.fun;

public class LambdaDemo {

	public static void main(String[] args) {

	// implementation
	Greeter greeter = (String username)->{
		System.out.println("Hello "+username);
	};
	// calling the method
	greeter.greetUser("Sri");
			
	Greeter greeter1 = username->System.out.println("Welcome "+username);
	greeter1.greetUser("Priya");
	
	
	Checker checker = (username, city)->{
		if(username.equals("Sri")&& city.equals("Ban")) return true;
		return false;
	};
	System.out.println(checker.checkName("Sri", "Bangalore"));
	
	
	Printer printer = ()->{
		return "Great Day";
	};
	System.out.println(printer.print());

	printer = ()->"Welcome back";
	System.out.println(printer.print());
	}
}











