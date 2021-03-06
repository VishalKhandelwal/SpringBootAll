package com.vk.people.management.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.vk.people.management.app.entities.Person;

public interface PeopleManagementDao extends CrudRepository<Person, Integer> {

}
