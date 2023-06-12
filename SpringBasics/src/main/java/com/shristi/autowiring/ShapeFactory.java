package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	
	@Autowired
//	@Qualifier("triangle") // autowiring by type
	Shape shape; // autowiring by name
	
	void printArea(int x, int y) {
		 shape.area(x, y);
	}
	
}
