package com.springboot.database.databasedemio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.database.databasedemio.bean.Person;
import com.springboot.database.databasedemio.dao.PersonJdbcDao;;
@RestController
public class GetPersons {
	@GetMapping("/getPersons")
	public List<Person> findAll(){
		PersonJdbcDao dao=new PersonJdbcDao();
		return dao.getAllPerson();
	}
}
