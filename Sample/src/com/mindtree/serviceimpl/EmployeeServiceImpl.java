package com.mindtree.serviceimpl;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import com.mindtree.Daoimpl.EmployeeDaoImpl;
import com.mindtree.entity.Employee;
import com.mindtree.exceptions.DepartmentException;
import com.mindtree.exceptions.EmployeeException;
import com.mindtree.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	Employee e = new Employee();
	DepartmentServiceImpl deptServImpl = new DepartmentServiceImpl();
	EmployeeDaoImpl empdaoImpl = new EmployeeDaoImpl();
	@Override
	public String addEmployee(Employee emp) throws EmployeeException, ClassNotFoundException, SQLException, DepartmentException
	{
		Employee d = display(emp.getEmpId());
		System.out.println(deptServImpl.display(emp.getId()).getId());
		if(d.getEmpId()!=0)
			throw new EmployeeException();
		else if(deptServImpl.display(emp.getId()).getId()==0)
			throw new DepartmentException ();
		return empdaoImpl.addEmployee(emp);
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException, ClassNotFoundException, SQLException 
	{
		e = display(empId);
		if(e.getEmpId()==0)
			throw new EmployeeException();
		
		return empdaoImpl.deleteEmployee(empId);
	}

	@Override
	public List<Employee> display() throws ClassNotFoundException, SQLException {
		
		return empdaoImpl.display();
	}

	@Override
	public Employee display(int empId) throws ClassNotFoundException, SQLException {
		
		return empdaoImpl.display(empId);
	}

	@Override
	public HashMap<Integer,Employee> sortByName() throws ClassNotFoundException, SQLException 
	{
		return empdaoImpl.sortByName();
	}

}
