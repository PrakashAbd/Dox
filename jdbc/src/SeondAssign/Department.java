package SeondAssign;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Department 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/abc","root","Welcome123");
		PreparedStatement p = c.prepareStatement("create table if not exists department(deptId int primary key,deptName varchar(10),deptloc varchar(10))");
		p.executeUpdate();
		//p = c.prepareStatement("alter table student add foreign key (departmentID) references department(deptID)");
		p = c.prepareStatement("insert into department(deptID,deptName,deptloc) values(?,?,?)");
		int ch = 0;
		do
		{
			System.out.println("1.Insert 2.Display 3.Exit");
			ch = s.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter Department ID, name and location");
						p.setInt(1, s.nextInt());
						p.setString(2, s.next());
						p.setString(3, s.next());
						p.executeUpdate();
						break;
				case 2: p = c.prepareStatement("select * from department");
						ResultSet rs = p.executeQuery();
						while(rs.next())
							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
						break;
				default: System.out.println("Exit");
			}
		}while(ch<3);
		p.close();
		c.close();
		s.close();
	}
}