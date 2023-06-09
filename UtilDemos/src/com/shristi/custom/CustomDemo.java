package com.shristi.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomDemo {
	
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Ram", "Ban",10));
		customers.add(new Customer("Jo", "Pune",11));
		customers.add(new Customer("Henry", "Ban",12));
		customers.add(new Customer("Mickey", "Pune",15));
		customers.add(new Customer("Rohit", "Pune",16));
		customers.add(new Customer("Rohit", "Bangalore",16));
		customers.add(new Customer("Rohit", "Pune",17));
		
		Collections.sort(customers);
		
		
		System.out.println("List of customers");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	
		System.out.println("List of customers by city");
		
		for (Customer customer : customers) {
			if(customer.getCity().equals("Pune"))
				System.out.println(customer);
		}
	}

}
