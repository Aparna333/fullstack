package com.cts.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	//static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/project";
	static final String UN="root";
	static final String PASS="pass";
	private static Connection conn=null;
	
	public static Connection getConnectionForDb() throws SQLException{
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn=DriverManager.getConnection(DB_URL, UN, PASS);
		return conn;
	}
}




