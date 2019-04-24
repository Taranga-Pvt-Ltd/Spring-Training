package com.tharanga.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class LoginService {
	public boolean check(String uname, String pass)
	{
		String url="jdbc:mysql://localhost:3306/project2";
		String user="root";
		String password="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement("select * from logindetails where uname=? and pass=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
			
		}catch(Exception e) 
		{
			System.out.println(e);
		}
		
		return false;
	}

}
