package com.shristi.eleven;

public class StringDemo {

	public static void main(String[] args) {
		
		//isBlank and strip
		System.out.println("".isBlank()); // true
		System.out.println(" ".isBlank()); // true
		// removes trailing and leading
		System.out.println("Great!!!"+(" Sripriya ").strip()+"Bye"); 

		String message = " Have a great day\n  Reading is fun\n Enjoy Sports ";

		// converts a String separated by new lines into a Stream<String>
		message.lines().forEach(str -> System.out.println(str.strip()));
		// strip Leading
		System.out.println("Have fun!"+(" Music Lovers ").stripLeading() + "Bye");
		// strip Trailing
		System.out.println("Music Lovers".concat(" Have fun ").stripTrailing() + "Bye");
		// repeat
		System.out.println("Good Life ".repeat(3));

	}

}
