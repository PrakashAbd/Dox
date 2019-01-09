package com.mindtree.dao;

import java.util.List;

import com.mindtree.exceptions.AppDaoException;
import com.mindtree.util.Employee;

public interface EmployeeDao 
{
	String addEmployee(Employee employee)throws AppDaoException;
	List<Employee> getAllEmployees()throws AppDaoException;
	Employee getEmployeeById(int id) throws AppDaoException;
}
