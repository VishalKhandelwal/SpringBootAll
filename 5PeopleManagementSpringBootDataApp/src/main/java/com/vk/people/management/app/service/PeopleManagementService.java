package com.vk.people.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.people.management.app.dao.PeopleManagementDao;
import com.vk.people.management.app.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManagementDao peopleManagementDao;
	
	public Person createPerson(Person person1) {
		
		return peopleManagementDao.save(person1);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		Iterable<Person> list = peopleManagementDao.saveAll(personList);
		return list;
	}

	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return peopleManagementDao.findAllById(ids);
	}

	public void deletePersonEntity(Person person) {
		peopleManagementDao.delete(person);
	}

	public void updatePersonEmailById(int id, String newEmail) {
		Person person = peopleManagementDao.findById(id).get();
		if(id == person.getId())
		{
			person.setEmail(newEmail);
		}
		
		peopleManagementDao.save(person);
	}

}
