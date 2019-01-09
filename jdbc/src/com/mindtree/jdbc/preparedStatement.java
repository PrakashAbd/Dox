package com.mindtree.jdbc;
import java.util.Scanner;
import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class preparedStatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/abc","root","Welcome123"); 
		PreparedStatement p = c.prepareStatement("insert into student(studentName,studentAddress) values(?,?)");
		ResultSet rs = null ;
		int ch = 0;
		do
		{
			System.out.println("1.Insert 2.Print records 3.Database MetaData 4.ResultSet MetaData 5.Exit");
			ch = s.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the StudentName and StudentAddress");
						p.setString(1,s.next());
						p.setString(2, s.next());
						p.executeUpdate();
						break;
				case 2: PreparedStatement p1 = c.prepareStatement("select * from student");
						rs = p1.executeQuery();
						while(rs.next())
							System.out.println(rs.getInt(1)+" "+rs.getString("studentName")+" "+rs.getString("studentAddress"));
						break;
				case 3: DatabaseMetaData mt = c.getMetaData();
						System.out.println(mt.getURL()+"\n"+mt.getDatabaseProductName()+"\n"+mt.getSQLKeywords());
						break;
				case 4:	ResultSetMetaData rsmd = rs.getMetaData(); 
						System.out.println(rsmd.getColumnCount()+"\n"+rsmd.getColumnName(1)+"\n"+rsmd.getColumnType(1)+"\n"+rsmd.getColumnTypeName(1));
						break;
				default: System.out.println("Exit");
			}		
		}while(ch<5);
		s.close();
	}
}