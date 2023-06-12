package com.shristi.autojavabased;

public class Square implements Shape{

	@Override
	public void area(int length, int breadth) {
		System.out.println("Sq "+(length*length));
	}

}
