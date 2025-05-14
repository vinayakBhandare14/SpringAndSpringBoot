package com.aop.AOP1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppCnfig.class);
        
        Student student = context.getBean(Student.class);       
        student.studySomething();
        
        System.out.println("==============================================================");
        
        Employee employee = context.getBean(Employee.class);
        employee.studyAnything();
    }
}
