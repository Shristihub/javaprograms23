package com.shristi.ten;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMeth {
	public static void main(String[] args) {
		
		// Immutable List
		List<String> newcourses = 
				Arrays.asList("Java","Angular")
				.stream()
				.collect(Collectors.toUnmodifiableList());
		
		// Immutable List
		Set.copyOf(newcourses); 
		
	}

}
