package com.mindtree.dao;
import java.util.List;
import com.mindtree.entity.Employee;

public interface EmployeeDao 
{
	String addEmployee(Employee e);
	String deleteEmployee(Employee e) throws Exception;
	String updateEmployee(Employee e);
	Employee displayById(int id);
	List<Employee> displayEmployee();
}