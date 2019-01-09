package com.mindtree.dao;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import com.mindtree.entity.Employee;

public interface EmployeeDao 
{
	String addEmployee(Employee emp);
	String deleteEmployee(int empId);
	List<Employee> display() throws ClassNotFoundException, SQLException;
	Employee display(int empId) throws ClassNotFoundException, SQLException;
	HashMap<Integer, Employee> sortByName() throws ClassNotFoundException, SQLException;
}
