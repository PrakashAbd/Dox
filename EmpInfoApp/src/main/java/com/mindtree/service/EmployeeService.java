package com.mindtree.service;
import java.util.List;

import com.mindtree.entity.Employee;
import com.mindtree.exception.DaoException;
import com.mindtree.exception.MyException;

public interface EmployeeService 
{
	int addEmployee(Employee employee);
	Employee getEmployee(int empNum) throws DaoException;
	void deleteEmployee(int empNum);
	void updateEmployee(Employee employee) throws MyException;
	List<Employee> getEmployees();
}