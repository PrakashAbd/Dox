package com.mindtree.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil 
{
	static String url = "jdbc:mysql://localhost/bank";
	static String username = "root";
	static String password = "Welcome123";
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection(url,username,password); 
		return c;
	}
}