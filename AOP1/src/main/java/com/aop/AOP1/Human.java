package com.aop.AOP1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	
	@After("Mypointcut()")
	public void speep() {
		System.out.println("Hi, I'm Human GoodNignt!!!");
	}
	
	@Before("Mypointcut()")//------- this is a pointcut
	public void wake() {
		System.out.println("Hi, I'm Human Good Morning!!!");//-----This all body is Aspect
	}
	
	@Pointcut("execution(public * study*())") 
	public void Mypointcut() {}

}
