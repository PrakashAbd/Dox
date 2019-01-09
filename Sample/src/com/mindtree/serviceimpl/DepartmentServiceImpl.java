package com.mindtree.serviceimpl;
import java.sql.SQLException;
import java.util.List;
import com.mindtree.Daoimpl.DepartmentDaoImpl;
import com.mindtree.entity.Department;
import com.mindtree.exceptions.MyException;
import com.mindtree.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService
{
	Department dept  = new Department();
	DepartmentDaoImpl deptDaoImpl = new DepartmentDaoImpl();
	@Override
	public String addDepartment(Department dept) throws MyException 
	{
		Department d = display(dept.getId());
		if(d.getId()!=0)
			throw new MyException();
		
		return deptDaoImpl.addDepartment(dept);
	}

	@Override
	public String deleteDepartment(int deptId) throws MyException
	{
		dept = display(deptId);
		if(dept.getId()==0)
			throw new MyException();
		
		return deptDaoImpl.deleteDepartment(deptId);
	}

	@Override
	public List<Department> display() throws ClassNotFoundException, SQLException 
	{		
		return deptDaoImpl.display();
	}

	@Override
	public Department display(int deptId) 
	{
		return deptDaoImpl.display(deptId);
	}

}
