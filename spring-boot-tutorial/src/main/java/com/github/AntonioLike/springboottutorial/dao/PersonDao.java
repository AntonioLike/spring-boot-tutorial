package com.github.AntonioLike.springboottutorial.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.github.AntonioLike.springboottutorial.model.Person;

public interface PersonDao {
	
	int insertPerson(UUID id, Person person);
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}

	List<Person> selectAllPeople();
	
	int deletePersonById(UUID id);
	
	int updatePersonById(UUID id, Person person);
	
	Optional<Person> selectPersonById(UUID id);
}
