package com.lawrence.techtest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lawrence.dao.DataAccess;
import com.lawrence.model.User;

/**
 * Servlet implementation class signUp
 */
public class signUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String forename = request.getParameter("forename");
	    String surname = request.getParameter("surname");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");
	    
	    User newUser = new User(0, forename, surname, email, password);
	    DataAccess database = new DataAccess();
	    System.out.println("database = " + database);
	    try {
	    	System.out.println("add new called in servlet");
			database.addNew(newUser);
		} catch (SQLException e) {
			System.out.println("error adding user at servlet level");
			e.printStackTrace();
		}
	    
	    out.println(forename);
	    out.println(surname);
	    out.println(email);
	    out.println(password);
	}

}
