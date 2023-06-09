package com.shristi.nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmuteList {

	public static void main(String[] args) {
		// pre java 9
		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Angular");
		List<String> newcourses = Collections.unmodifiableList(courses);
//		newcourses.add("Node");

		// from java 9 unModifiableList
		List<String> ncourses = List.of("Perl", "Java", "Angular", "Node");
//		ncourses.add("Node");
		ncourses.forEach(System.out::println);
		List<String> emptyList = List.of();
		System.out.println();
		
		// immutable Set
		Set<String> imSet = Set.copyOf(ncourses);
//		imSet.add("Node");
		imSet.forEach(System.out::println);

		
	}
}
