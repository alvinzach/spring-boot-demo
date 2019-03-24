package com.springboot.database.databasedemio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.databasedemio.bean.Person;
import com.springboot.database.databasedemio.dao.PersonJdbcDao;
import com.springboot.database.databasedemio.repository.personRepo;

@RestController
public class GetSinglePerson {
	Logger log=LoggerFactory.getLogger(getClass());
	@Autowired
	personRepo person;
	@GetMapping("/getPerson/{id}")
	public Person getPerson(@PathVariable("id") int id) {
		System.out.println("id >>>>"+id);
		return person.getPerson(id);
	}
}
