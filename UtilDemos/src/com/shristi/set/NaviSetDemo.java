package com.shristi.set;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NaviSetDemo {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Angular","Html","CSS","Node","React");
		NavigableSet<String> set = new TreeSet<>(courses);
		System.out.println(set);
		// returns a reverse set
		NavigableSet<String> naviSet = set.descendingSet();
		System.out.println(naviSet);
		
		//exclusive of the element
		set.headSet("Html").forEach(System.out::println);
		//inclusive of the elemnt
		set.headSet("Html",true).forEach(System.out::println);
		//starts exclusive from the element to the end
		set.tailSet("Html", false).forEach(System.out::println);
		System.out.println("Similar to descendingSet().iterator()");
		set.descendingIterator().forEachRemaining(System.out::println);
		System.out.println();
		// from inclusive to exclusive
		set.subSet("CSS", "Java").forEach(System.out::println);
		System.out.println();
		
		
		System.out.println(set.lower("Node")); //Java
		System.out.println(set.lower("Nodee")); //Node
		System.out.println(set.higher("Node"));// React
		System.out.println(set.higher("Nodee")); //React
		System.out.println();
		System.out.println(set.ceiling("Node")); //Node
		System.out.println(set.ceiling("Nodee")); //React
		System.out.println(set.floor("Node")); //Node
		System.out.println(set.floor("Nodee")); //Node
		
		System.out.println(set.lower("Angular")); //null
	}
}
