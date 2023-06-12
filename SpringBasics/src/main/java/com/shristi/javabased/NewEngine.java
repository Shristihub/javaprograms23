package com.shristi.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class NewEngine {
	private String type;
	private String mileage;
	
	public String getType() {
		return type;
	}
//	@Value("Petrol")
	public void setType(String type) {
		this.type = type;
	}
	public String getMileage() {
		return mileage;
	}
//	@Value("12km/hr")
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", mileage=" + mileage + "]";
	}
	

}
