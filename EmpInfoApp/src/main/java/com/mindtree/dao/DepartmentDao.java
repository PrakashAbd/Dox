package com.mindtree.dao;
import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;
import com.mindtree.exception.MyException;

public interface DepartmentDao 
{
	Department getDeptById(int deptNum);
	void createDepartment(Department dept) throws MyException;
	void addEmployeeToDepartment(Employee emp,Department dept);
	void RemoveEmployeeFromDepartment(Employee emp,Department dept);
}