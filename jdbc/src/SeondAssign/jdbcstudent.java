package SeondAssign;
import java.util.Scanner;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcstudent
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/abc","root","Welcome123");
		PreparedStatement p = c.prepareStatement("create table if not exists student(rollNumber int auto_increment primary key,studentName varchar(10),studentAddress varchar(10),departmentID int)");
		p.executeUpdate();
		p = c.prepareStatement("insert into student(studentName,StudentAddress,departmentID) values(?,?,?)");
		int ch = 0;
		do
		{
			System.out.println("1.Insert 2.Display 3.Cse Dept 4.Exit");
			ch = s.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter Student name,address and departmentID");
						p.setString(1, s.next());
						p.setString(2, s.next());
						p.setInt(3, s.nextInt());
						p.executeUpdate();
						break;
				case 2: CallableStatement cs = c.prepareCall("{call GetAllStudents()}");
						ResultSet rs = cs.executeQuery();
						while(rs.next())
							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
						break;
				case 3: p = c.prepareStatement("select * from student where departmentid=100");
						ResultSet rs1 = p.executeQuery();
						while(rs1.next())
							System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getInt(4));
						break;
				default: System.out.println("Exit");
			}
		}while(ch<4);
		p.close();
		c.close();
		s.close();
	}
}