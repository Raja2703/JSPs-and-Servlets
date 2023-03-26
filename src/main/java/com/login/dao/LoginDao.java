package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	public boolean checkCred(String uname,String pass){
		
		String sql="select * from user_cred where uname=? and pass=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_details","root","Root@2709");
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, uname);
			stmt.setString(2, pass);
			ResultSet rs=stmt.executeQuery();
			
			if(rs.next()) {
				return true;
			}
		}catch(Exception e) {
			System.out.println("Inside catch");
			System.out.println(e);
		}
		return false;
	}
}
