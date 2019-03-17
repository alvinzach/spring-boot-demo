package com.springboot.database.databasedemio;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.databasedemio.bean.Person;
import com.springboot.database.databasedemio.bean.addPersonResponse;
import com.springboot.database.databasedemio.dao.PersonJdbcDao;

@RestController
public class AddPerson {
@PostMapping("/addPerson")
	public addPersonResponse addPerson(@RequestBody Person p) {
		PersonJdbcDao dao = new PersonJdbcDao();
		int a=dao.addPerson(p.getName(),p.getPhone(),p.getAddress());
		addPersonResponse response=new addPersonResponse();
		if(a==1) {
			response.setStatus(200);
			response.setMessage("success");
		}
		else {
			response.setStatus(400);
			response.setMessage("failed");
		}
		return response;	
}
}
