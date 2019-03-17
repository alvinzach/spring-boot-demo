package com.springboot.database.databasedemio.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.database.databasedemio.bean.Person;

@Repository
public class PersonJdbcDao {
	@Autowired
	JdbcTemplate jdbcTemplate =new JdbcTemplate(DataSourceConfig.dataSource());
	public List<Person> getAllPerson(){
		return jdbcTemplate.query("select * from contactsnew",new BeanPropertyRowMapper(Person.class));
	}
	public Person getPerson(int id) {
		return jdbcTemplate.queryForObject("select * from  contactsnew where id=?",new Object[] {id},new BeanPropertyRowMapper<Person>(Person.class));
	}
	public int addPerson(String name,long phno,String address) {
		return jdbcTemplate.update("insert into contactsnew(name,address,phone) values(?,?,?)",new Object[] {name,address,phno});
	}
}
