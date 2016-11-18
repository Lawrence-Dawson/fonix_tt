package com.lawrence.dao;

import java.sql.PreparedStatement;

import com.lawrence.dbConnection.DbConnection;
import com.lawrence.model.User;

public class DataAccess {
	public void addNew(User n) {
		try {
			PreparedStatement ps = DbConnection.getPreparedStatement("insert into user values(?,?,?,?)");
			ps.setString(1, n.getForename());
			ps.setString(1, n.getSurname();
			ps.setString(1, n.getEmail();
			ps.setString(1, n.getPassword();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
