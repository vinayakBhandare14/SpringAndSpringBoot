package com.mzos.JpaHNDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzos.JpaHNDemo.repo.PesonRepository.PersonRepository;
import com.mzos.JpaHNDemoBeans.Person;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	 public void savePerson(Person person) {
		 
		 personRepository.save(person);
	 }

}
