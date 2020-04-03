package com.github.AntonioLike.springboottutorial.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.github.AntonioLike.springboottutorial.model.Person;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{
	private static List<Person> DB = new ArrayList<Person>();
	
	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}
}