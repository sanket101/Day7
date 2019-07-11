package com.controller;

import java.sql.*;

public class VerificationBin {
	
	public int checkUser(String usr, String psw) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from user_details");
			
			while(rs.next()) {
				if(rs.getString(1).equals(usr) && rs.getString(2).equals(psw)) {
					return 0;
				}
			}
		}
		catch(Exception e) {
			return 1;
		}
		
		return 1;
	}
}
