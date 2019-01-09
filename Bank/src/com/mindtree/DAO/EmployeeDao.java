package com.mindtree.DAO;

import java.util.List;

import com.mindtree.entity.Employee;

public interface EmployeeDao 
{
	String addEmployee(Employee employee);
	Employee getEmployee(int empId);
	List<Employee> getAllEmployee() throws Exception;
	String updateEmployee(Employee updateEmployee);
	String deleteEmployee(int empId);
}
