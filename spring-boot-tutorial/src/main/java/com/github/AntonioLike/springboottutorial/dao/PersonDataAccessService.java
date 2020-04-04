package com.github.AntonioLike.springboottutorial.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.github.AntonioLike.springboottutorial.model.Person;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao{

	@Override
	public int insertPerson(UUID id, Person person) {
		return 0;
	}

	@Override
	public List<Person> selectAllPeople() {
		return List.of(new Person(UUID.randomUUID(), "From Postgres DB"));
	}

	@Override
	public int deletePersonById(UUID id) {
		return 0;
	}

	@Override
	public int updatePersonById(UUID id, Person person) {
		return 0;
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		return null;
	}

}
