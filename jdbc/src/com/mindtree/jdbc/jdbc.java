package com.mindtree.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class jdbc 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/abc","root","Welcome123");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		while(rs.next())
			System.out.println(rs.getInt("rollNumber"));
		//p.executeUpdate();
		c.close();
	}
}