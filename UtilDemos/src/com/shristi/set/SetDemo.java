package com.shristi.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		Set<String> hashSet = new HashSet<>();
//		Set<String> hashSet = new LinkedHashSet<>();
		Set<String> hashSet = new TreeSet<>();
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banan");
		hashSet.add("Kiwi");
		hashSet.add("100");
//		hashSet.add(null);
		hashSet.add("Apple"); //duplicate
		System.out.println(hashSet);
		for (String element : hashSet) {
			System.out.println(element);
		}

	}

}
