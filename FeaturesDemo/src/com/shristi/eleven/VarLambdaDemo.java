package com.shristi.eleven;

import java.util.function.BiConsumer;

public class VarLambdaDemo {
	public static void main(String[] args) {

		BiConsumer<String, String> con = 
				(var s1, var s2) -> System.out.println(s1.concat(s2));

		// data type is must if annotation is used with variable
		// can use String or var
		BiConsumer<String, String> con2 = (var s1, var s2) -> System.out.println(s1.concat(s2));

		// error as both paramaters should have type declared
//		BiConsumer<String,String> con1 = (s1, var s2)->System.out.println(s1.concat(s2));

	}

}
