package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private final Department department;

	@Autowired
	public Employee(Department department) {
		this.department = department;
	}
	public void showInfo() {
		System.out.println("Department : "+department.getDptName());
	}
}


