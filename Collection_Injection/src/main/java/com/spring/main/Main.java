package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Employee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		Employee employee = context.getBean("Employee1", Employee.class);
		System.out.println(employee);

		System.out.println("=====================================");
		
		System.out.println(employee.getName());
		System.out.println(employee.getPhones());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCource());
	}
}
