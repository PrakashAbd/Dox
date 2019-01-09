package com.mindtree.DAO.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mindtree.DAO.EmployeeDao;
import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;
import com.mindtree.servicesimpl.BankServiceImpl;
import com.mindtree.util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao 
{
	Connection con = null;
	PreparedStatement ps = null;
	@Override
	public String addEmployee(Employee employee) 
	{
		String msg = "";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("insert into Employee(empId,name,salary,department,designation,gender,dateOfJoining,bankCode) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getName());
			ps.setDouble(3, employee.getSalary());
			ps.setString(4, employee.getDepartment());
			ps.setString(5, employee.getDesignation());
			ps.setString(6, employee.getGender());
			ps.setString(7, employee.getDateOfJoining());
			ps.setInt(8, employee.getBank().getBankCode());
			ps.executeUpdate();
			msg =  "Employee "+employee.getName()+" detail added successfully";
			con.close();
			ps.close();
		}
		catch (ClassNotFoundException e) {		msg = "Cannot be added "+e;		} 
		catch (SQLException e) 		 	 {		msg = "Cannot be added "+e;		}
		return msg;
	}

	@Override
	public Employee getEmployee(int empId) 
	{
		Employee c = new Employee();
		BankDaoImpl bimpl = new BankDaoImpl();
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from Employee where empId="+empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				c.setEmpId(rs.getInt(2));
				c.setName(rs.getString(3));
				c.setSalary(rs.getDouble(4));
				c.setDepartment(rs.getString(5));
				c.setDesignation(rs.getString(6));
				c.setGender(rs.getString(7));
				c.setDateOfJoining(rs.getString(8));
				Department o  = bimpl.getBankDetailId(rs.getInt(1));
				c.setBank(o);
				con.close();
				ps.close();
			}
		} catch (ClassNotFoundException e)  {		System.out.println("Cannot be added "+e);		}
		catch (SQLException e) 				{		System.out.println("Cannot be added "+e);		}
		return c;
	}

	@Override
	public List<Employee> getAllEmployee() throws Exception 
	{
		List<Employee> list = new ArrayList<Employee>();
		BankServiceImpl bsim = new BankServiceImpl();
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from Employee");
			ResultSet rs = ps.executeQuery();
			Employee emp = null;
			while(rs.next())
			{
				emp = new Employee();
				emp.setEmpId(rs.getInt(2));
				emp.setName(rs.getString(3));
				emp.setSalary(rs.getDouble(4));
				emp.setDepartment(rs.getString(5));
				emp.setDesignation(rs.getString(6));
				emp.setGender(rs.getString(7));
				emp.setDateOfJoining(rs.getString(8));
				Department b1 = bsim.getBankDetailId(rs.getInt(1)); 
				emp.setBank(b1);
				list.add(emp);
			}
			con.close();
			ps.close();
		} 
		catch (ClassNotFoundException e) {		System.out.println(e);	}
		catch (SQLException e) 			 {		System.out.println(e);	}
		
		return list;	
	}

	@Override
	public String updateEmployee(Employee updateEmployee) 
	{
		String msg = "";
		try 
		{
			con = DbUtil.getConnection();
			ps = con.prepareStatement("update Employee set name = ?, salary = ?,department = ?,designation = ?,gender = ?,dateOfJoining = ?  where empId = ? and bankCode = ?");
			ps.setString(1, updateEmployee.getName());
			ps.setDouble(2, updateEmployee.getSalary());
			ps.setString(3, updateEmployee.getDepartment());
			ps.setString(4, updateEmployee.getDesignation());
			ps.setString(5, updateEmployee.getGender());
			ps.setString(6, updateEmployee.getDateOfJoining());
			ps.setInt(7,updateEmployee.getEmpId());
			Department b1 = updateEmployee.getBank();
			ps.setInt(8,b1.getBankCode());
			msg = (ps.executeUpdate()>0)? "Updated Succesfully": "EmployeeId not found in that Bank... So Cannot be Updated" ;
			con.close();
			ps.close();
		}
		catch (ClassNotFoundException e) {			msg = "Cannot be updated "+e;	}
		catch (SQLException e) 			 {			msg = "Cannot be Updated "+e;	}
		return msg;	
	}

	@Override
	public String deleteEmployee(int empId) 
	{
		String msg = "";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete from Employee where empId = "+empId);
			ps.executeUpdate();
			msg = "Deleted Successfully";
			con.close();
			ps.close();
		}
		catch (ClassNotFoundException e) 	{		msg = "Cannot be deleted "+e;			}
		catch (SQLException e) 				{		msg = "Cannot be Deleted "+e;		}
		return msg;
	}
}