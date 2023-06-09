package com.shristi.jni;

public class Greeter {
	// create the native method
	public native void greetUser(String username, int times);

	// load the library that implements the method
	static {
	//	Loads the native library given by the argument
		System.loadLibrary("GreetImpl");
	}
}