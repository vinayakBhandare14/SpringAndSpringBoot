package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name = "Tony Stark";
	
	//Field Injection
	@Autowired
	private Department  department;
	
	public void showDetals() {
		System.out.println("Name of Employee : "+name);
		System.out.println("department : "+department.getDptname());
	}
}
