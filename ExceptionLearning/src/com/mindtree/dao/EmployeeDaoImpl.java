package com.mindtree.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.exceptions.AppDaoException;
import com.mindtree.util.DBUtil;
import com.mindtree.util.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	private Connection con=null;
	private PreparedStatement ps =null;
	private String msg="";
	Employee emp=null;
	List<Employee> employeelist=new ArrayList<Employee>();

	@Override
	public String addEmployee(Employee employee) throws AppDaoException {
		// TODO Auto-generated method stub
		String query="insert into employee values (?,?,?,?,?,?,?,?)";
		con=DBUtil.connect();
		try {
			ps=con.prepareStatement(query);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getDob());
			ps.executeUpdate();
			msg="employee "+employee.getName()+" added successfully";
		} catch (SQLException   e) {
			msg="employee "+employee.getName()+" is not added";
			throw new AppDaoException(msg,e);
		}catch(Exception e) {
			msg="employee "+employee.getName()+" is not added";
			throw new AppDaoException(msg,e);
		}
		DBUtil.closeConnection(con);
		return msg;
	}

	@Override
	public List<Employee> getAllEmployees() throws AppDaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) throws AppDaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
