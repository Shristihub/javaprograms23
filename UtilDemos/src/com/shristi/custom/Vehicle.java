package com.shristi.custom;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{
	private String model;
	private String brand;
	private long price;
	
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String model, String brand, long price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model) && price == other.price;
	}
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Vehicle o) {
		return this.getBrand().compareTo(o.getBrand());
	}
	

}
