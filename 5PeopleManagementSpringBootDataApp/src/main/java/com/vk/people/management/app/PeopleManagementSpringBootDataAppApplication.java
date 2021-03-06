package com.vk.people.management.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
		// TODO Auto-generated method stub
		//createPerson();
		//createPersons();
		//getPersonByIds();
		//deletePersonEntity();
		updatePersonEmailById();
	}

	private void updatePersonEmailById() {
		peopleManagementService.updatePersonEmailById(1,"vishu2018@gmail.com");
		
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(3);
		peopleManagementService.deletePersonEntity(person);
		
	}

	private void getPersonByIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		ids.add(20);
		
		Iterable<Person> personList = peopleManagementService.getPersonByIds(ids);
		personList.forEach(System.out::println);
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Barry", "Johnson", "barry.j2019@Gmail.com", 
				 LocalDate.now()),new Person("Kishan", "Kumar", "kishan.cs2019@yahoo.com", LocalDate.now()));
		Iterable<Person> createPersons = peopleManagementService.createPersons(personList);
		
		for (Person person : createPersons) {
			System.out.println(person);
		}
	}

	private void createPerson() {
		
		Person person1 = new Person("Vishal", "Khandelwal", "Vishal@gmail.com", LocalDate.now());
		Person personDb = peopleManagementService.createPerson(person1);
		System.out.println(personDb);
	}

}
