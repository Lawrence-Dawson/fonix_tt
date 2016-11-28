package com.lawrence.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.lawrence.dbConnection.DbConnection;
import com.lawrence.model.User;
import com.lawrence.security.Password;


public class DataAccess {
	public void addNew(User newUser) throws SQLException {
		System.out.println("add new user function called");
		try {
			if (checkUnique(newUser.getEmail())) {
				System.out.println("User not unique");
				return;
			} else {
			System.out.println("Adding record");
			
			PreparedStatement ps = DbConnection.getPreparedStatement("INSERT INTO USERS (Forename, Surname, Email, Password)" + "VALUES(?,?,?,?)");
			String password = newUser.getPassword();
			
			ps.setString(1, newUser.getForename());
			ps.setString(2, newUser.getSurname());
			ps.setString(3, newUser.getEmail());
			ps.setString(4, Password.hashPassword(password));
			ps.executeUpdate();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Error adding record");
		}
		System.out.println("Record successfully added to database");
	}

	public boolean checkUnique(String email) throws ClassNotFoundException, SQLException {
		System.out.println("Checking if user is unique");
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
	
	public User retrieveUser(String email,String password) throws SQLException, ClassNotFoundException {
		System.out.println("retrieve in process");
		final String queryCheck = "SELECT User_id, Forename, Surname, Email, Password " +
             "FROM users WHERE email = ?";
		final PreparedStatement ps = DbConnection.getPreparedStatement(queryCheck);
		ps.setString(1, email);
		 ResultSet resultSet = ps.executeQuery();
		 System.out.println("results set = " + resultSet);
		 while (resultSet.next()) {
			  int id = resultSet.getInt("User_id");
			 String forename = resultSet.getString("Forename");
			 String surname = resultSet.getString("Surname");
			 String hashedPassword = resultSet.getString("Password");
			 if (Password.checkPassword(password, hashedPassword)){
				 User retrievedUser = new User(id, forename, surname, email, password);
				 System.out.println("found user");
				 return retrievedUser;
			 	} else {
			 	System.out.println("passwords don't match");
			 	 return null;
			}
		 }
		System.out.println("user not found");
		return null;
	}
	
}
