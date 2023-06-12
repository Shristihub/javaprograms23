package com.shristi.autojavabased;

public class Rectangle implements Shape{

	@Override
	public void area(int length, int breadth) {
		System.out.println("Rect "+(length*breadth));
	}

}
