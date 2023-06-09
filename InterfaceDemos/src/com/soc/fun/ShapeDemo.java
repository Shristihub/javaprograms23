package com.soc.fun;

interface Shape{
	void area(int x, int y);
}

class ShapeDetails{
	
	void showArea(Shape shape, int x, int y) {
		System.out.println("Printing Area");
		shape.area(x,y);
		System.out.println("Done");
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		ShapeDetails shapeDetails = new ShapeDetails();
		
		shapeDetails.showArea((x,y)->{
			System.out.println("Rect "+(x*y));
			System.out.println("Calculated");
		}, 100, 200);
	}
}
