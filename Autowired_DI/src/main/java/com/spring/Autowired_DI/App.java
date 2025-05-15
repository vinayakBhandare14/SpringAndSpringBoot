package com.spring.Autowired_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
     Student student =   context.getBean("student",Student.class);
     System.out.println(student);
    }
}
