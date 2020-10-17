package com.cra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	static DBConnector db;

	public DBConnector() throws ClassNotFoundException {
		super();
		Class.forName("com.mysql.jdbc.Driver");
		// TODO Auto-generated constructor stub
	}

	public DBConnector getInstance() throws ClassNotFoundException {
		
		if(db==null)
			db=new DBConnector();
		return db;
	}
	public static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Alca234@#$");
	}

}
