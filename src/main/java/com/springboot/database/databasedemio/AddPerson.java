package com.springboot.database.databasedemio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.databasedemio.bean.Person;
import com.springboot.database.databasedemio.bean.addPersonResponse;
import com.springboot.database.databasedemio.dao.PersonJdbcDao;
import com.springboot.database.databasedemio.repository.personRepo;

@RestController
public class AddPerson {
	@Autowired
	personRepo person;
@PostMapping("/addPerson")
	public Person addPerson(@RequestBody Person p) {
		return person.updatePerson(p);
}
}
