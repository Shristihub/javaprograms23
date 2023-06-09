package com.shristi.nine;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws Exception {
	}

	public void readFile() throws IOException {

		// Using Java 7
		FileReader fileReader = new FileReader("demo.txt");
		try (FileReader reader11 = fileReader;) {
			// logic goes here
		}
		// Using Java 11
		FileReader reader = new FileReader("demo.txt");
		try (reader) {
//			logic goes here
		}

	}

}
