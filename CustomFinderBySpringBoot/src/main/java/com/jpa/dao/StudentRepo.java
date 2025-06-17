package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.model.Student;

public interface StudentRepo extends CrudRepository<Student,Integer>{
	
	public List<Student>findByName(String name);
	
	@Query("select s from Student s")
	public List<Student> ShowAllStudent();
	
	@Query("select s from Student s where s.name =:n")
	public List<Student> getStudentByName( @Param("n") String name); //Parameterized query
	
}
