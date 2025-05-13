package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name ="Alis";
	private Department department;
	
	
	//Setter Injection
	@Autowired
	public void SetDepartment(Department department) {
		this.department = department;
	}
	
	public void showInfo() {
		System.out.println("Department : "+department.getDptName());
		System.out.println("Employee name : "+name);
	}
	
}
