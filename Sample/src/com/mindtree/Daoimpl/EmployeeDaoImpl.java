package com.mindtree.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.Employee;
import com.mindtree.util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao
{
	private Connection con  = null;
	private PreparedStatement ps = null;
	boolean flag = true;
	@Override
	public String addEmployee(Employee emp) 
	{
		String msg = "";
		try
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("Create table if not exists Employee (empId int,name varchar(15),salary double)");
			ps.executeUpdate();
			
			ps = con.prepareStatement("insert into Employee(empId,Name,salary) values(?,?,?)");
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.executeUpdate();
			con.close();
			ps.close();
			msg = "Employee "+emp.getName()+" added successfully";
		}
		catch (ClassNotFoundException e)
		{		msg = "Sorry...Unable to add Employee detail "+e;		}
		catch(SQLException e) 
		{		msg = "Unable to add Employee detail"+ e;				}
		
		return msg;
	}

	@Override
	public String deleteEmployee(int empId) 
	{
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete from Employee where empId = "+empId);
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
	public List<Employee> display() throws ClassNotFoundException, SQLException 
	{
		List<Employee> list = new ArrayList<Employee>();
		con = DbUtil.getConnection();
		ps = con.prepareStatement("select * from Employee");
		ResultSet rs = ps.executeQuery();
		Employee obj = null;
		while(rs.next())
		{
			obj = new Employee();
			obj.setEmpId(rs.getInt(1));
			obj.setName(rs.getString(2));
			obj.setSalary(rs.getDouble(3));
			list.add(obj);
		}
		con.close();
		ps.close();
		return list;
	}

	@Override
	public Employee display(int empId) throws ClassNotFoundException, SQLException 
	{
		Employee bank = new Employee();
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from Employee where empId="+empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				bank.setEmpId(rs.getInt(1));
				bank.setName(rs.getString(2));
				bank.setSalary(rs.getDouble(3));
				con.close();
				ps.close();
			}
		}
		catch (ClassNotFoundException e)
		{		System.out.println("Sorry...Unable to get employee detail "+e);		}
		catch(SQLException e) 
		{		System.out.println("Unable to fetch employee detail"+ e);				}
		return bank;
	}

	@Override
	public HashMap<Integer,Employee> sortByName() throws ClassNotFoundException, SQLException 
	{
		List<Employee> list = display();
		
		Comparator<Employee> compareName = (a,b)->a.getName().compareTo(b.getName());
		Comparator<Employee> compareSalary = (a,b)->String.valueOf(a.getSalary()).compareTo(""+b.getSalary());
		
		list.stream().sorted(compareName).sorted(compareSalary).forEach(System.out::println);
				
		HashMap<Integer,Employee> hmap = new HashMap<Integer,Employee>();
		
		int i=1;
		for(Employee e: list)
			hmap.put(i++, e);
		
		return hmap;
	}
	
}
