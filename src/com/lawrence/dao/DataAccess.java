package com.lawrence.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.lawrence.dbConnection.DbConnection;
import com.lawrence.model.User;


public class DataAccess {
	public void addNew(User newUser) throws SQLException {
		System.out.println("add new user function called");
		try {
			System.out.println("Adding record");
			PreparedStatement ps = DbConnection.getPreparedStatement("INSERT INTO USERS (Forename, Surname, Email, Password)" + "VALUES(?,?,?,?)");
			ps.setString(1, newUser.getForename());
			ps.setString(2, newUser.getSurname());
			ps.setString(3, newUser.getEmail());
			ps.setString(4, newUser.getPassword());
			ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("Error adding record");
		}
		System.out.println("Record successfully added to database");
	}
}
