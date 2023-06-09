package com.soc.training;

public class ScientificCalc extends BasicCalculator implements Scientific{

	@Override
	public void square(int x) {
		System.out.println(Math.pow(x, 2));
	}

	@Override
	public void sqroot(int x) {
		System.out.println(Math.sqrt(x));
	}

	@Override
	public void cube(int x) {
		System.out.println("Printing cube value");
		super.cube(x);
		System.out.println("done");
	}

}
