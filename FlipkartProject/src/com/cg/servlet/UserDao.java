package com.cg.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.connectionfactory.ConnectionFactory;

public class UserDao {
	public boolean register(String Username,String password )  throws SQLException 
	{
		    Connection con =ConnectionFactory.getConnection();
		    String sql = "insert into cloud values (?,?)";
			  PreparedStatement pst =con.prepareStatement(sql);
			  pst.setString(1, Username);
			  pst.setString(2, password);
			 
			  pst.executeUpdate();
			
		return true;
	}
}

