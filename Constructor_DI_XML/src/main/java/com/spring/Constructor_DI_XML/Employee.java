package com.spring.Constructor_DI_XML;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName= employeeName;
	}
	/*
	 * public String toString() { return this.employeeId+ " "+ this.employeeName; }
	 */

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	
	
	

}
