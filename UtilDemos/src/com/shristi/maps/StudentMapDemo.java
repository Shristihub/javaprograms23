package com.shristi.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMapDemo {

	public static void main(String[] args) {
		Map<Department, List<Student>> hashMap = new HashMap<>();
		Department department1 = new Department("Jo",1,"CSE");
		Department department2 = new Department("Rahul",2,"ECE");
		Department department3 = new Department("Murali",3,"IT");
		Department department4 = new Department("Murali",4,"Civil");
		
		hashMap.put(department1, 
				     Arrays.asList(new Student("Ram","Bangalore"),new Student("Jo","Bangalore")));
		hashMap.put(department2, 
			     Arrays.asList(new Student("Roni","Chennai"),new Student("Sasi","Chennai")));
		hashMap.put(department3, 
			     Arrays.asList(new Student("Kayal","Ooty"),new Student("Kavya","Chennai")));
		hashMap.put(department4,null);
		
		for (Map.Entry<Department, List<Student>> entry : hashMap.entrySet()) {
			Department department = entry.getKey();
			List<Student> students = entry.getValue();
			System.out.println(department);
			hashMap.putIfAbsent(department4, Arrays.asList(new Student("Kayal","Ooty")));
			for (Student student : students) {
				System.out.println(student.getStudName());
			}
			System.out.println();
			
		}
		
		
	}

}
