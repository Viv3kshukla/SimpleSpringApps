package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootControllerJBDC {

	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	
	public String index() {
		System.out.println("Helo users this is getting printed");
		jdbc.execute("insert into USERS(name,email)values('javatpoint','java@javatpoint.com')");
		return "data inserted Successfully";
		
	}
	
	
	
	
}
