package com.mintree.service;
import java.util.List;

import com.mindtree.exceptions.AppException;
import com.mindtree.util.Employee;
public interface EmployeeService 
{
	String addEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id) throws AppException;
}