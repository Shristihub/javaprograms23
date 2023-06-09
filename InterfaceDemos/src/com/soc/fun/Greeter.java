package com.soc.fun;


@FunctionalInterface
public interface Greeter {

	void greetUser(String username);
	
}


class GreeterImpl implements Greeter{

	@Override
	public void greetUser(String username) {
		System.out.println("Great Day "+username);
	}
	
}