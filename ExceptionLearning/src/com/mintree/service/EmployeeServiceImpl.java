package com.mintree.service;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.exceptions.AppException;
import com.mindtree.util.Employee;

public class EmployeeServiceImpl implements EmployeeService 
{
	private List<Employee> employees =new ArrayList<Employee>();
	@Override
	public String addEmployee(Employee employee) 
	{
		this.employees.add(employee);
		return "Added Successfully";
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		return this.employees;
	}

	@Override
	public Employee getEmployeeById(int id) throws AppException 
	{
		Employee e = new Employee();
		try {	e = (Employee) employees.stream().map(e1 -> e1.getId()==id);				}

		catch(ClassCastException ex) { throw new AppException("Unable to get Employee "+ex);}
		
		return e;
	}
}