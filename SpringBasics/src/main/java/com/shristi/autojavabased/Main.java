package com.shristi.autojavabased;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.autojavabased");
		String[] beanNames = context.getBeanDefinitionNames();
		Stream.of(beanNames).forEach(System.out::println);
//		
		ShapeFactory factory  = context.getBean(ShapeFactory.class);
		factory.printArea("t",10,20);
//		factory.printArea("s",10,20);
//		factory.printArea("r",10,20);
		
			
		

	}

}
