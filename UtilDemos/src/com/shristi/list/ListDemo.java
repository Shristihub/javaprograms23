package com.shristi.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("100");
		list.add("Sspring");
		list.add("node");
		list.add("angular");
		list.add("maven");
		list.add(1, "Helen");
		Collections.sort(list);
		System.out.println(list);
		list.set(1, "Jo");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list);
		System.out.println();
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String val = iterator.next();
			System.out.println(val);
		}
		System.out.println("Reverse iteration");
		ListIterator<String> iter = list.listIterator(list.size());
		while (iter.hasPrevious()) {
			String val = iter.previous();
			System.out.println(val);
			
		}
	}

}
