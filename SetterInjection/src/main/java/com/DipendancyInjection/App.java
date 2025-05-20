package com.DipendancyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
        
        Student student1 = context.getBean("student1",Student.class);
        System.out.println(student1);
        
        System.out.println("===========================================");
        
        Student student2 = (Student)context.getBean("student2");
        System.out.println(student2);
        
        System.out.println("===========================================");
        
        Student student3 = context.getBean("student3",Student.class);
        System.out.println(student3);
    }
}
