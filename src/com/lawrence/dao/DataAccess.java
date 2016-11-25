package com.lawrence.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.lawrence.dbConnection.DbConnection;
import com.lawrence.model.User;


public class DataAccess {
	public void addNew(User newUser) throws SQLException {
		System.out.println("add new user function called");
		try {
			if (checkUnique(newUser.getEmail())) {
				return;
			} else {
			System.out.println("Adding record");
			PreparedStatement ps = DbConnection.getPreparedStatement("INSERT INTO USERS (Forename, Surname, Email, Password)" + "VALUES(?,?,?,?)");
			ps.setString(1, newUser.getForename());
			ps.setString(2, newUser.getSurname());
			ps.setString(3, newUser.getEmail());
			ps.setString(4, newUser.getPassword());
			ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Error adding record");
		}
		System.out.println("Record successfully added to database");
	}

	public boolean checkUnique(String email) throws ClassNotFoundException, SQLException {
		final String queryCheck = "SELECT count(*) from USERS WHERE Email = ?";
		final PreparedStatement ps = DbConnection.getPreparedStatement(queryCheck);
		ps.setString(1, email);
		final ResultSet resultSet = ps.executeQuery();
		if(resultSet.next()) {
		    final int count = resultSet.getInt(1);
		    System.out.println( count );
		    if (count > 0) {
		    	System.out.println("user with email address " + email + " already present");
		    	return true;
		    }
		}
		return false;
	}
}
