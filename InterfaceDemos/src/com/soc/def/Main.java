package com.soc.def;

public class Main {

	public static void main(String[] args) {
		
		BonusCalculator bonusCalculator = new Employee();
		bonusCalculator.calculate(2000);
		AllowanceCalculator allowanceCalculator = 
				(AllowanceCalculator)bonusCalculator;
		allowanceCalculator.calculate(5000);
		
		bonusCalculator.greet("Priya");
		allowanceCalculator.greet("Sri");
		
		// static method can be called only using interafce name
		BonusCalculator.call();
		// default methods can be called using the object ref
		new Employee().greet("Ko");
	}
}
