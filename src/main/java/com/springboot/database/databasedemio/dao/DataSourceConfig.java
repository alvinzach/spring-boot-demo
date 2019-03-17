package com.springboot.database.databasedemio.dao;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;

public class DataSourceConfig {
	public static DataSource dataSource() {
	    return DataSourceBuilder
	        .create()
	        .url("jdbc:sqlite:/media/zack/Data/workspace/java/contactmanager.db")
	        .driverClassName("org.sqlite.JDBC")
	        .build();
	}
}
