package com.example.serviceimpl;

import java.util.List;
import com.example.boot.Config;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	public String addEmployee(Employee employee) 
	{		return Config.getEmployeeDao().addEmployee(employee);		}


	public String deleteEmployee(String empId) 
	{		return Config.getEmployeeDao().deleteEmployee(empId);		}

	
	public List<Employee> displayAll() 
	{		return Config.getEmployeeDao().displayAll();				}

	
	public String updateEmployee(Employee employee) 
	{		return Config.getEmployeeDao().updateEmployee(employee);	}

	
	public Employee displayById(String empId) 
	{		return Config.getEmployeeDao().displayById(empId);			}

}