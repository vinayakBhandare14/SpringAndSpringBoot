package com.example;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private String dptName = "Testing";
	
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	
	public String getDptname() {
		return dptName;
	}
	

}
