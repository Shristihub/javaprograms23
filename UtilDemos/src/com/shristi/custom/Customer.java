package com.shristi.custom;

public class Customer implements Comparable<Customer>{
	private String name;
	private String city;
	private Integer customerId;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String city, Integer customerId) {
		super();
		this.name = name;
		this.city = city;
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", customerId=" + customerId + "]";
	}
	@Override
	public int compareTo(Customer c) {
		int nameVal = this.getName().compareTo(c.getName());
		int cityVal = this.getCity().compareTo(c.getCity());
		int idVal = ((Integer)this.getCustomerId()).compareTo((Integer)c.getCustomerId());
		if(nameVal==0) {
			if(cityVal==0) { 
				return idVal;
			}else
				return cityVal;
		}else
			return nameVal;
	}
	
	

}
