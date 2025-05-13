package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	Employee employee = context.getBean(Employee.class);
    	employee.showDetals();
    	context.close();
    }
}
