package com.soc.training;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new BasicCalculator();
		calculator.add(10, 20);
		
		Scientific scientific = new ScientificCalc();
		scientific.sqroot(9);
		scientific.square(2);
		scientific.cube(3);
	}
}
