package com.mzos.JpaHNDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mzos.JpaHNDemoBeans.Person;

public interface PesonRepository {
	@Repository
	public interface PersonRepository extends JpaRepository<Person , Integer >{
		
	}

}
