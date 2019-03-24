package com.springboot.database.databasedemio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.database.databasedemio.bean.Person;
import com.springboot.database.databasedemio.dao.PersonJdbcDao;
import com.springboot.database.databasedemio.repository.personRepo;;
@RestController
public class GetPersons {
	@Autowired
	personRepo person=new personRepo();
	@GetMapping("/getPersons")
	public List<Person> findAll(){
		return person.getAll();
	}
}
