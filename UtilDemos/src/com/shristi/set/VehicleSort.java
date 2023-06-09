package com.shristi.set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.shristi.custom.Vehicle;

public class VehicleSort {

	public static void main(String[] args) {
		List<Vehicle> vehicleList = Arrays.asList(
				new Vehicle("City", "Honda", 2390000),
				new Vehicle("Hexa", "Tata", 1290000), 
				new Vehicle("Santro", "Hyundai", 4390000),
				new Vehicle("A100", "Audi", 230000),
				new Vehicle("A100", "Audi", 4590000),
				new Vehicle("X10", "Maruthi", 1190000));
		
		Set<Vehicle> vehicleSet = new TreeSet<>(vehicleList);
		System.out.println(vehicleSet);
		System.out.println();
		for (Vehicle vehicle : vehicleSet) {
			System.out.println(vehicle);
		}
		
	}
}
