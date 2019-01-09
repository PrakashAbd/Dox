package com.mindtree.ServiceImpl;

import java.util.List;

import com.mindtree.dao.hibernateImpl.EmployeeDaoHibernateImpl;
import com.mindtree.entity.Employee;
import com.mindtree.exception.DaoException;
import com.mindtree.exception.MyException;
import com.mindtree.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	EmployeeDaoHibernateImpl edl = new EmployeeDaoHibernateImpl();
	public int addEmployee(Employee employee) 
	{
		return edl.addEmployee(employee);
	}

	public Employee getEmployee(int empNum) throws DaoException 
	{
		return edl.getEmployee(empNum);
	}

	public void deleteEmployee(int empNum) 
	{
		edl.deleteEmployee(empNum);
	}

	public void updateEmployee(Employee employee) throws MyException 
	{
		if(edl.getEmployee(employee.getEmpNum())== null )
			throw new DaoException();
		edl.updateEmployee(employee);
	}

	public List<Employee> getEmployees() 
	{	
		return edl.getEmployees();
	}
}