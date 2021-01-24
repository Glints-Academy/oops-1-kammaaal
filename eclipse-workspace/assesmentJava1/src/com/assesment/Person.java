package com.assesment;

public class Person {
	String name;
	String address;
	
	// making Person constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	//making getName method
	public String getName() {
		return name;
	}
	
	//making getAdress method
	public String getAddress() {
		return address;
	}
	
	// making setAdress method to setting person adress
	public void setAddress(String address) {
		this.address = address;
	}
	
	// make toString method to returning person data
	@Override
	public String toString() {
		return name + "(" + address + ")";
	}
}
