package com.shristi.maps;

public class Student {

	private String studName;
	private String city;
	public Student(String studName, String city) {
		super();
		this.studName = studName;
		this.city = city;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", city=" + city + "]";
	}
	
}
