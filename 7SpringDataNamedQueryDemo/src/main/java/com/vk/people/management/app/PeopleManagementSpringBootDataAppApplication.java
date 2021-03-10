package com.vk.people.management.app;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vk.people.management.app.entities.Person;
import com.vk.people.management.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getPersonIfoByLastName();
		//getPersonInfoByFirstNameAndEmail();
	}

	private void getPersonInfoByFirstNameAndEmail() {
		List<Person> personList = peopleManagementService.getPersonInfoByFirstNameAndEmail("Barry","barry.j2019@Gmail.com");
		personList.forEach(System.out::println);
		
	}

	private void getPersonIfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonIfoByLastName("Khandelwal");
		personList.forEach(System.out::println);
	}

}
