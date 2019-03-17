package com.springboot.database.databasedemio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.springboot.database.databasedemio.bean.Person;
import com.springboot.database.databasedemio.dao.PersonJdbcDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
@SpringBootApplication
public class DatabasedemioApplication {
	private Logger logger=LoggerFactory.getLogger(this.getClass());

    
	public static void main(String[] args) {
		PersonJdbcDao personDao =new PersonJdbcDao();
		SpringApplication.run(DatabasedemioApplication.class, args);
		System.out.println(personDao.getAllPerson());
	}
}
