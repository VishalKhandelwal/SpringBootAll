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

	public List<Person> getPersonIfoByLastName(String lastName) {
		
		return peopleManagementDao.getPeronInfoByLastName(lastName);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {
		// TODO Auto-generated method stub
		return peopleManagementDao.findByFirstNameAndEmail(firstName, email);
	}
	
}
