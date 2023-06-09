package com.shristi.eleven;

import java.lang.reflect.Method;
import java.util.Arrays;

class Outer {
	
	public void publicMeth() {	}
	private void privateMeth() { 
		System.out.println("hello");
	}
	
	// nested class
	class Inner{
		public void innerMeth() {
			// can access the private method() - 
			//compiles fine
			privateMeth();
		}
	}
}
public class NestedDemo	{
	public static void main(String[] args) throws Exception {
		Outer ob = new Outer();
		// Invoke using Reflection pre java 11
		Method meth = ob.getClass().getDeclaredMethod("privateMeth");
//		 Throws IllegalAccessException 
//		cannot access a member of class Outer with modifiers "private"
//		meth.invoke(ob);
		
		//Outer class is the nest host
		System.out.println(Outer.class.getNestHost().getName());
		//Outer class is the nest host
		System.out.println(Outer.Inner.class.getNestHost().getName());
		
		//All the nested members
		Arrays.stream(Outer.Inner.class.getNestMembers())
	      .map(Class::getName).forEach(System.out::println);
	}
}
