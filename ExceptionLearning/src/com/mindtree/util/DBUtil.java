package com.mindtree.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mindtree.exceptions.AppDaoException;

public class DBUtil 
{
	private static String url = "jdbc:mysql://localhost/bank";
	private static String user = "root";
	private static String password = "Welcome123";

	public static Connection connect() throws AppDaoException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new AppDaoException("Connection not established..", e);
		} catch (ClassNotFoundException e) {
			throw new AppDaoException("Driver not loaded..",e);
		}
	}

	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} 
			catch (SQLException e) {	
			}
		}
	}

}
