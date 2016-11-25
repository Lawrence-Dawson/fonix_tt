package com.lawrence.dbConnection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;

public class DbConnection {
	public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException {
		PreparedStatement ps = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost/fonixdb";
		String user="root";
		String password="";	
		
		Connection con = null;
		try {
			con = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("Connected successfully");
		} catch (SQLException e) {
			System.out.println("Connection string error");
		}
		try {
			ps = con.prepareStatement(sql);
			System.out.println("Prepare statement success");
		} catch (SQLException e) {
			System.out.println("Prepare statement failure");

		}
		return ps;
	}

}
