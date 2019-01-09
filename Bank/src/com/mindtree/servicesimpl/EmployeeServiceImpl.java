package com.mindtree.servicesimpl;
import java.util.List;
import com.mindtree.DAO.impl.BankDaoImpl;
import com.mindtree.DAO.impl.EmployeeDaoImpl;
import com.mindtree.entity.Employee;
import com.mindtree.exceptions.BankCodeException;
import com.mindtree.exceptions.EmployeeException;

public class EmployeeServiceImpl 
{
	EmployeeDaoImpl e = new EmployeeDaoImpl();
	BankDaoImpl bdi = new BankDaoImpl();
	
	public boolean checkEmpId(int empId) throws Exception
	{
		List<Employee> list = getAllEmployee();
		for(Employee c : list )
		{	
			if(c.getEmpId()==empId)
				return false;
		}
		return true;
	}
	
	public String addEmployee(Employee employee) throws Exception 
	{	
		if(checkEmpId(employee.getEmpId()))
		{
			if(bdi.getBankDetailId(employee.getBank().getBankCode()).getBankCode() == 0)
				throw new BankCodeException();
		}
		else	throw new Exception("Employee Id already exists");
			
		return e.addEmployee(employee);
	}
	
	public Employee getEmployee(int empId) throws Exception 
	{
		if(checkEmpId(empId)==false)
			return e.getEmployee(empId);
		else throw new EmployeeException();
	}
	
	public List<Employee> getAllEmployee() throws Exception
	{
		List<Employee> list = e.getAllEmployee();
		return list;
	}
	
	public String updateEmployee(Employee updateEmployee) throws Exception 
	{
		if(checkEmpId(updateEmployee.getEmpId())==false)
			return e.updateEmployee(updateEmployee);	
		else throw new EmployeeException();
	}
	
	public String deleteEmployee(int empId) throws Exception 
	{
		if(checkEmpId(empId)==false)
			return e.deleteEmployee(empId);	
		else throw new EmployeeException();
	}	
}