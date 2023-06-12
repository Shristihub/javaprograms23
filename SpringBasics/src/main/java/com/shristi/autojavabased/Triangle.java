package com.shristi.autojavabased;

public class Triangle implements Shape{

	@Override
	public void area(int length, int breadth) {
		System.out.println("Tri "+(breadth*length*0.5));
	}

}
