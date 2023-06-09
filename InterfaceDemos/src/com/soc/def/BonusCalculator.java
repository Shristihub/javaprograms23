package com.soc.def;

public interface BonusCalculator {
	void calculate(int amount);

	// can be overridden and called using the implementation class object
	default void greet(String name) {
		System.out.println("Hello" + name);
	}
	
	// cannot override it. can be called only using 
	static void call() {
		System.out.println("Calling for lunch");
	}
	
	
}

