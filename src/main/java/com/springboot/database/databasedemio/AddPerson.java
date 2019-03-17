package com.springboot.database.databasedemio;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.databasedemio.dao.PersonJdbcDao;

@RestController
public class AddPerson {
@GetMapping("/addPerson")
	public String addPerson(@RequestParam("name") String name,@RequestParam("phone") long phone,@RequestParam("address") String addr) {
		PersonJdbcDao dao = new PersonJdbcDao();
		int a=dao.addPerson(name,phone,addr);
		if(a==1)
			return "Success";
		else 
			return "Failed";
}
}
