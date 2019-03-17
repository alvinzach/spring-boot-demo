package com.springboot.database.databasedemio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.databasedemio.bean.Person;
import com.springboot.database.databasedemio.dao.PersonJdbcDao;

@RestController
public class GetSinglePerson {
	Logger log=LoggerFactory.getLogger(getClass());
	@GetMapping("/getPerson/{id}")
	public Person getPerson(@PathVariable("id") int id) {
		log.info("getting person");
		PersonJdbcDao dao=new PersonJdbcDao();
		return dao.getPerson(id);
	}
}
