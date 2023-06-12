package com.shristi.autojavabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class ShapeFactory {
	@Autowired
	@Qualifier("getRect") 
	Shape shape;

//	@Autowired
//	@Qualifier("striangle") 
//	Shape tshape; 

//	@Autowired
//	Shape myshape;

	public void printArea(String choice, int x, int y) {

		System.out.println("Printing Area");
			shape.area(x, y);
//		if (choice.equals("t"))
//			tshape.area(x, y);
//		if (choice.equals("s"))
//			myshape.area(x, y);
	}

}
