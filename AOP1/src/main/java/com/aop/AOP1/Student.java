package com.aop.AOP1;

import org.springframework.stereotype.Component;

@Component
public class Student {
  
	
	public int studySomething() {
		System.out.println("I'm Student Studying right now");
		return 0;
	}
}
