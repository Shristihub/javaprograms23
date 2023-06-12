package com.shristi.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.autowiring");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		// for sutowiring
		ShapeFactory factory  = context.getBean("shapeFactory",ShapeFactory.class);
		factory.printArea(10,20);
		
		
		SocShapeFactory socShapeFactory = context.getBean(SocShapeFactory.class);
		socShapeFactory.printArea("s", 10, 10);

	}

}
