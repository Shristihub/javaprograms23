package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SocShapeFactory {
	// if more than one bean of same type is available
	@Autowired
    @Qualifier("triangle") // autowiring by type
	Shape tshape;
    
	// if bean name is same as the instance variable name
	@Autowired
	Shape shape; //     autowiring by name
	
	@Autowired
	Shape rectangle; // autowiring by name
	
	
	public void printArea(String s,int x, int y) {
		System.out.println("printing area");
		if(s.equals("s"))
			shape.area(x, y);
		if(s.equals("r"))
			rectangle.area(x, y);
		if(s.equals("t"))
			tshape.area(x, y);
	}

}
