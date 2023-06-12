package com.shristi.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewVehicle {
	private String brand;
	private double price;
	
	@Autowired
	private NewEngine newEngine;
	
	public String getBrand() {
		return brand;
	}
	@Value("Honda")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public NewEngine getNewEngine() {
		return newEngine;
	}
	
	public void setNewEngine(NewEngine newEngine) {
		this.newEngine = newEngine;
	}
	public double getPrice() {
		return price;
	}
	@Value("982903")
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", price=" + price + ", engine=" + newEngine + "]";
	}

}
