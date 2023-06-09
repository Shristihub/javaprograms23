package com.soc.def;

public class Employee implements BonusCalculator,AllowanceCalculator{

	@Override
	public void calculate(int amount) {
		System.out.println("Total"+(amount*5));
	}

	@Override
	public void greet(String name) {
		System.out.println("have a great day "+name);
		// to call the default method of the interface
		AllowanceCalculator.super.greet(name);
		BonusCalculator.super.greet(name);
	}

	static void sayHello() {
		System.out.println("hello");
	}
}
