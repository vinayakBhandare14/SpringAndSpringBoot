package com.spring.Constructor_DI_XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
        
        Employee employee = context.getBean("employee", Employee.class);
        
        System.out.println(employee);
    }
}
