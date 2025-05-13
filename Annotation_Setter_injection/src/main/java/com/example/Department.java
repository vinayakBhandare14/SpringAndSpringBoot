package com.example;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	public String dptName = "Electrical";
	
	public String getDptName() {
		return dptName;
	}
	
	public void setDptName(String dptName) {
		this.dptName=dptName;
	}
}