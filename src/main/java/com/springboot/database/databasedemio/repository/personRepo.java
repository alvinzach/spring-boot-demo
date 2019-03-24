package com.springboot.database.databasedemio.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.database.databasedemio.bean.Person;

@Repository
@Transactional
public class personRepo {
	@PersistenceContext
	EntityManager entityManager;
	public Person getPerson(int id) {
		return entityManager.find(Person.class, id);
	}
	public Person updatePerson(Person person) {
		return entityManager.merge(person);
	}
	public List<Person>	getAll(){
		TypedQuery<Person> q=entityManager.createNamedQuery("select_all",Person.class);
		return q.getResultList();
	}
}
