package com.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.StudentRepo;
import com.jpa.model.Student;

@SpringBootApplication
public class CustomFinderBySpringBootApplication {

    private final StudentRepo studentRepo;

    CustomFinderBySpringBootApplication(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CustomFinderBySpringBootApplication.class, args);
		
		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		
//		Student s1 = new Student();
//		s1.setName("Vinayak");
//		s1.setPercentage(87.22);
//		
//		Student student1 = studentRepo.save(s1);
//		System.out.println(student1);
		
		List<Student> findByName = studentRepo.findByName("Vinayak");
		
		System.out.println(findByName);
		
		System.out.println("===============================");
	
		findByName.forEach( e -> System.out.println(e));
		
		System.out.println("==============Show All=================");
		
		List<Student> showAll = studentRepo.ShowAllStudent();
		 showAll.forEach( e -> System.out.println(e));
		
		System.out.println("============== Parameterized query =================");
		
		List<Student> showByName = studentRepo.getStudentByName("Lukesh");
		showByName.forEach(e->System.out.println(e));
	}

}
