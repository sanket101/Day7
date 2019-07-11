package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterValidation
 */
public class RegisterValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterValidation() {
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
		// TODO Auto-generated method stub
		String username = request.getParameter("usr");
		String password = request.getParameter("pwd");
		String password2 = request.getParameter("pwd2");
		int age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter pw = response.getWriter();
		
		if(!username.equals("") && !password.equals("") && !password2.equals("") && password.equals(password2)) {
			UserRegistration ur = new UserRegistration();
			int ifAdded = ur.addUser(username, password, age);
			if(ifAdded == 0) {
				request.setAttribute("name", username);
				request.getRequestDispatcher("SuccessfulRegister.jsp").forward(request, response);
			}
			else {
				pw.println("<h1>Sorry, Server Not Reachable...</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("Register.html");
				rd.include(request, response);
			}
		}
		else {
			pw.println("<h1>Sorry Incomplete Credentials...</h1>");
			RequestDispatcher rd = request.getRequestDispatcher("Register.html");
			rd.include(request, response);
		}
	}

}
