package com.mindtree.service;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import com.mindtree.entity.Employee;
import com.mindtree.exceptions.DepartmentException;
import com.mindtree.exceptions.EmployeeException;

public interface EmployeeService 
{
	String addEmployee(Employee emp) throws EmployeeException, ClassNotFoundException, SQLException, DepartmentException;
	String deleteEmployee(int empId) throws EmployeeException, ClassNotFoundException, SQLException;
	List<Employee> display() throws ClassNotFoundException, SQLException;
	Employee display(int empId) throws ClassNotFoundException, SQLException;
	HashMap<Integer, Employee> sortByName() throws ClassNotFoundException, SQLException;
}
