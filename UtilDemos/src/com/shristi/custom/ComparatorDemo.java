package com.shristi.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BrandSort implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		return o1.getBrand().compareTo(o2.getBrand());
	}
}
// unrelated class used for meth ref
class ModelChecker{
	public static int checkModel(Vehicle o1, Vehicle o2) {
		return o1.getModel().compareTo(o2.getModel());
	}
}



public class ComparatorDemo {
	public static void main(String[] args) {
		List<Vehicle> vehicles = Arrays.asList(new Vehicle("City", "Honda", 2390000),
				new Vehicle("Hexa", "Tata", 1290000), new Vehicle("Santro", "Hyundai", 4390000),
				new Vehicle("A100", "Audi", 4590000), new Vehicle("X10", "Maruthi", 1190000));
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}

		Collections.sort(vehicles, new BrandSort());
		System.out.println("By brand");
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		System.out.println("By model");
		Collections.sort(vehicles, (o1, o2) -> o1.getModel().compareTo(o2.getModel()));
		for (Vehicle nvehicle : vehicles) {
			System.out.println(nvehicle);
		}
		System.out.println("By price");
		Collections.sort(vehicles, (o1, o2) -> ((Long) o1.getPrice()).compareTo((Long) o2.getPrice()));
		for (Vehicle pvehicle : vehicles) {
			System.out.println(pvehicle);
		}
		System.out.println("By model - Meth ");
		Collections.sort(vehicles,ModelChecker::checkModel );
		for (Vehicle nvehicle : vehicles) {
			System.out.println(nvehicle);
		}
		
		
		
		
	}
}
