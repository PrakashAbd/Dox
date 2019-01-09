package com.mindtree.util;

import com.mintree.service.EmployeeService;
import com.mintree.service.EmployeeServiceImpl;

public class App 
{
	public static void main(String[] args) 
	{
		EmployeeService es= new EmployeeServiceImpl();
		Employee employee = new Employee();
		employee.setDob("10-1-2000");
		employee.setId(1);
		employee.setName("Arjun");
		System.out.println();
		System.out.println(es.addEmployee(employee));
        
        es.getAllEmployee().forEach(System.out::println);
        
        try {
			System.out.println(es.getEmployeeById(1));
		} catch (Exception e) {
			System.out.println(e.getMessage()+"\n"+e.getCause());
		}
	}
}