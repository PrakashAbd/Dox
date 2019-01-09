package com.mindtree.service;


import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;
import com.mindtree.exception.MyException;

public interface DepartmentService 
{
	void createDepartment(Department dept) throws MyException;
	Department getDeptById(int deptNum);
	void addEmployeeToDepartment(Employee emp,Department dept);
	void RemoveEmployeeFromDepartment(Employee emp,Department dept);
}