package com.mindtree.ServiceImpl;
import com.mindtree.dao.hibernateImpl.DepartmentDaoHibernateImpl;
import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;
import com.mindtree.exception.MyException;
import com.mindtree.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService
{
	DepartmentDaoHibernateImpl ddl = new DepartmentDaoHibernateImpl();
	public void createDepartment(Department dept) throws MyException 
	{
		ddl.createDepartment(dept);
	}

	public void addEmployeeToDepartment(Employee emp, Department dept) 
	{
		ddl.addEmployeeToDepartment(emp, dept);
	}

	public void RemoveEmployeeFromDepartment(Employee emp, Department dept) 
	{
		ddl.RemoveEmployeeFromDepartment(emp, dept);
	}

	public Department getDeptById(int deptNum) 
	{
		return ddl.getDeptById(deptNum);
	}
}