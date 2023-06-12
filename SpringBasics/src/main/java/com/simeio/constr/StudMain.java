package com.simeio.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class StudMain {

	public static void main(String[] args) {
		// create an object of IOC container
		ApplicationContext context = new AnnotationConfigApplicationContext("com.simeio");
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		AbstractApplicationContext abscontext =(AbstractApplicationContext)context;
		abscontext.close();
	
	}

}
