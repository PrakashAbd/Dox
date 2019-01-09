package com.mindtree.service;
import java.sql.SQLException;
import java.util.List;
import com.mindtree.entity.Department;
import com.mindtree.exceptions.MyException;

public interface DepartmentService 
{
	String addDepartment(Department dept) throws MyException;
	String deleteDepartment(int deptId) throws MyException;
	List<Department> display() throws ClassNotFoundException, SQLException;
	Department display(int deptId);
}
