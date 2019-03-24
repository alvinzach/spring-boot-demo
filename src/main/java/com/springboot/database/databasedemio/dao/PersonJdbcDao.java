package com.springboot.database.databasedemio.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;



import org.hibernate.persister.entity.PropertyMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.PropertyResolver;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.database.databasedemio.bean.Person;

@Repository
public class PersonJdbcDao {
	@Autowired
	JdbcTemplate jdbcTemplate =new JdbcTemplate(DataSourceConfig.dataSource());
	class personMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person p=new Person();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setAddress(rs.getString("address"));
			return p;
		}

		
	}
	public List<Person> getAllPerson(){
		return jdbcTemplate.query("select * from contactsnew",new personMapper());
	}
	public Person getPerson(int id) {
		return jdbcTemplate.queryForObject("select * from  contactsnew where id=?",new Object[] {id},new BeanPropertyRowMapper<Person>(Person.class));
	}
	public int addPerson(String name,long phno,String address) {
		return jdbcTemplate.update("insert into contactsnew(name,address,phone) values(?,?,?)",new Object[] {name,address,phno});
	}
}
