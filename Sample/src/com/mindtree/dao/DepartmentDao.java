package com.mindtree.dao;
import java.sql.SQLException;
import java.util.List;
import com.mindtree.entity.Department;

public interface DepartmentDao 
{
	String addDepartment(Department dept) throws ClassNotFoundException, SQLException;
	String deleteDepartment(int deptId);
	List<Department> display() throws ClassNotFoundException, SQLException;
	Department display(int deptId);
}
