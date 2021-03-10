package com.vk.people.management.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vk.people.management.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {
	List<Person> getPeronInfoByLastName(String lastName);
	List<Person> findByFirstNameAndEmail(String firstName,String email);
}
