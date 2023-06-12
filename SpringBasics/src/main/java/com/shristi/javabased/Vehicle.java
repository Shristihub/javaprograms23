package com.shristi.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

	private String brand;
	private double price;
	@Autowired
	private Engine engine;
	
	public String getBrand() {
		return brand;
	}
	@Value("Audi")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", price=" + price + ", engine=" + engine + "]";
	}
	
}
