package com.shristi.maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		
//		Map<Integer,String> hashMap = new HashMap<>();
//		Map<Integer,String> hashMap = new LinkedHashMap<>();
		Map<Integer,String> hashMap = new TreeMap<>();
		hashMap.put(1, "Java");
		hashMap.put(10, "Spring");
		hashMap.put(8, "Node");
//		hashMap.put(null, "Css");
		hashMap.put(3, "Angular");
		hashMap.put(5, "Html");
		hashMap.put(1, "react");
		hashMap.put(100, null);
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(10));
		System.out.println(hashMap.containsKey(10));
		System.out.println();
		
		Set<Integer> keys =  hashMap.keySet();
		for (Integer key : keys) {
			String val = hashMap.get(key);
			System.out.println(key+" "+val);
		}
		System.out.println();
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
		
		
	}

}
