package com.shristi.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("Sspring");
		list.add("node");
		list.add("angular");
//		list.add("maven");
		System.out.println(list);
//		list.addFirst("Html");
//		list.addLast("Css");
//		list.set(1, "react");
		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list);
		System.out.println();
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			String val = iterator.next();
//			System.out.println(val);
//		}
//		System.out.println("Reverse iteration");
//		ListIterator<String> iter = list.listIterator(list.size());
//		while (iter.hasPrevious()) {
//			String val = iter.previous();
//			System.out.println(val);
//			
//		}
//		
//		for(String val:list)
//			System.out.println(val);
//	}
//		
	System.out.println("Methods");
	System.out.println(list.peek());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.poll());
	System.out.println(list);
	System.out.println(list.element());
	
	
	
	
	
	
	
	
	
	
	
	}
}
