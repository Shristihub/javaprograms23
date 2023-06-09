package com.shristi.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmuteMap {

	public static void main(String[] args) {
		
		Map.of(1, "Java", 2, "Angular")
				.forEach((courseId, courseName) -> 
							System.out.println(courseName + " " + courseId));
		
		// using Map.Entry
		Map<Integer,String> map = Map.ofEntries(
							Map.entry(1, "Leadership"),
							Map.entry(2, "Five Point"),
							Map.entry(3, "Life"));
		map.forEach((bookId, title) -> 
			System.out.println(bookId + " " + title));

	}
}
