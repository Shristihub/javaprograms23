package com.soc.fun;


class Details{
	void printName(String name) {
		System.out.println("Welcome "+name);
	}
	static void sayHello(String name) {
		System.out.println("Hello "+name);
	}
}



public class RefDemo {
	public static void main(String[] args) {
		Greeter greeter = (name)->System.out.println("Welcome "+name);
		greeter.greetUser("Sri");
		
		Details details = new Details();
		
		// using not static method reference
		Greeter greeterOne = details::printName;
		greeterOne.greetUser("Priya");
		
		// using static method reference
		Greeter greeterTwo = Details::sayHello;
		greeterTwo.greetUser("Sri");
		
		
		
	}

}
