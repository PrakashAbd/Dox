package com.mindtree.Daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mindtree.dao.DepartmentDao;
import com.mindtree.entity.Department;
import com.mindtree.util.DbUtil;

public class DepartmentDaoImpl implements DepartmentDao
{
	private Connection con  = null;
	private PreparedStatement ps = null;
	@Override
	public String addDepartment(Department dept)  
	{
		String msg = "";
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("Create table if not exists Department (deptId int,deptName varchar(15))");
			ps.executeUpdate();
			
			ps = con.prepareStatement("insert into Department(deptId,deptName) values(?,?)");
			ps.setInt(1, dept.getId());
			ps.setString(2, dept.getDeptName());
			System.out.println(dept.getDeptName()+" "+dept.getId());
			ps.executeUpdate();
			con.close();
			ps.close();
			msg = "Inserted Successfully";
		}
		catch (ClassNotFoundException e)
		{		msg = "Sorry...Unable to add Department detail "+e;		}
		catch(SQLException e) 
		{		msg = "Unable to add Department detail"+ e;				}
		
		return msg;
	}

	@Override
	public String deleteDepartment(int deptId) 
	{
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete from Department where deptId = "+deptId);
			ps.executeUpdate();
			msg = "Deleted Successfully";
			con.close();
			ps.close();
		} 
		catch (ClassNotFoundException e) 
		{		msg = "Cannot be deleted "+e;			} 
		catch (SQLException e) 
		{		msg = "Cannot be Deleted "+e;			}
		
		return msg;
	}

	@Override
	public List<Department> display() throws ClassNotFoundException, SQLException 
	{
		List<Department> list = new ArrayList<Department>();
		con = DbUtil.getConnection();
		ps = con.prepareStatement("select * from department");
		ResultSet rs = ps.executeQuery();
		Department obj = null;
		while(rs.next())
		{
			obj = new Department();
			obj.setId(rs.getInt(1));
			obj.setDeptName(rs.getString(2));
			list.add(obj);
		}
		con.close();
		ps.close();
		return list;		
	}

	@Override
	public Department display(int deptId) 
	{
		Department dept = new Department();
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from department where deptId="+deptId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				dept.setId(rs.getInt(1));
				dept.setDeptName(rs.getString(2));
				con.close();
				ps.close();
			}
		}
		catch (ClassNotFoundException e)
		{		System.out.println("Sorry...Unable to add dept detail "+e);		}
		catch(SQLException e) 
		{		System.out.println("Unable to add dept detail"+ e);				}
		return dept;
	}
}