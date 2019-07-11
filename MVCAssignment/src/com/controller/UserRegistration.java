package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class UserRegistration {
	
	public int addUser(String usr, String psw, int age) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement("insert into user_details values (?, ?, ?)");
			
			pstmt.setString(1, usr);
			pstmt.setString(2, psw);
			pstmt.setInt(3, age);
			pstmt.execute();
			return 0;
		}
		catch(Exception e) {
			return 1;
		}
	}
}
