package com.spring.model;

public class Address {

	private String city;
	private int pin;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	
	
}
