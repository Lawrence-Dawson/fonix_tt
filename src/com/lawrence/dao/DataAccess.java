package com.lawrence.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.lawrence.dbConnection.DbConnection;
import com.lawrence.model.User;


public class DataAccess {
	public void addNew(User n) throws SQLException {
		try {
			System.out.println("Added record");
			PreparedStatement ps = DbConnection.getPreparedStatement("insert (?,?,?,?)");
			ps.setString(1, n.getForename());
			ps.setString(2, n.getSurname());
			ps.setString(3, n.getEmail());
			ps.setString(4, n.getPassword());
			ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			System.out.println("Error adding record");
		}
		
	}
}
