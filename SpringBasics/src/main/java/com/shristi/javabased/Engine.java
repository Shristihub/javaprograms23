package com.shristi.javabased;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String type;
	private String mileage;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", mileage=" + mileage + "]";
	}
	

}
