package com.mindtree.dao;
import java.util.List;

import com.mindtree.entity.Employee;

public interface EmployeeDao
{
	int addEmployee(Employee employee);
	Employee getEmployee(int empNum);
	void deleteEmployee(int empNum);
	void updateEmployee(Employee employee);
	List<Employee> getEmployees();
}