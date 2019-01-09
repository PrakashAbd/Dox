package com.mindtree.util;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;
import com.mindtree.exceptions.MyException;
import com.mindtree.serviceimpl.DepartmentServiceImpl;
import com.mindtree.serviceimpl.EmployeeServiceImpl;

public class MainApp 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner s = new Scanner(System.in);
		int ch  = 0;
		do
		{
			System.out.println("1.Department 2.Employee 3.Exit");
			ch = s.nextInt();
			switch(ch)
			{
			case 1: Department dept = new Department();
					DepartmentServiceImpl deptServImpl = new DepartmentServiceImpl();
					System.out.println("1.Add 2.Delete 3.DisplayAll 4.Exit");
					switch(s.nextInt())
					{
						case 1: System.out.println("Enter the Department Id");
								dept.setId(s.nextInt());
								System.out.println("Enter the Department Name");
								dept.setDeptName(s.next());
								try {
									System.out.println(deptServImpl.addDepartment(dept));
								} catch (MyException e1) {
									System.out.println(e1);
								}
								break;
						case 2: System.out.println("Enter the Department Id");
								try {
									System.out.println(deptServImpl.deleteDepartment(s.nextInt()));
								} 
								catch (MyException e1) {	System.out.println(e1);			}
								break;
						case 3: try {
								deptServImpl.display().stream().forEach( e -> System.out.println(e));
								} 
								catch (ClassNotFoundException e1) {System.out.println(e1);			}
								catch (SQLException e1) {	System.out.println(e1);					} 
								break;
						
					}	
					break;
			case 2: Employee emp = new Employee();
					EmployeeServiceImpl empServImpl = new EmployeeServiceImpl();
					System.out.println("1.Add 2.Delete 3.DisplayAll 4.DisplayById 5.Sort 6.Exit");
					switch(s.nextInt())
					{
						case 1: System.out.println("Enter the Employee Id");
								emp.setEmpId(s.nextInt());
								System.out.println("Enter the Employee Name");
								emp.setName(s.next());
								System.out.println("Enter the Employee Salary");
								emp.setSalary(s.nextDouble());
								System.out.println("Enter the Department Id and name");
								emp.setDept(s.nextInt(), s.next());
								
								try {
								System.out.println(empServImpl.addEmployee(emp));
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								break;
						case 2: System.out.println("Enter the Employee Id");
								try
								{
									empServImpl.deleteEmployee(s.nextInt());
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								break;
						case 3: try {		empServImpl.display().stream().forEach( e -> System.out.println(e));	}
								
								catch (ClassNotFoundException e) {	System.out.println(e);		}
								catch (SQLException e) 			 {	System.out.println(e);		} 
								break;
						case 4: System.out.println("Enter the Employee Id");
								try {	System.out.println(empServImpl.display(s.nextInt()));	}
								
								catch (ClassNotFoundException e) {	System.out.println(e);		}							
								catch (SQLException e) 			 {	System.out.println(e);		}	
								break;
						case 5: HashMap<Integer,Employee> hmap = empServImpl.sortByName();
								hmap.forEach((k,v) -> System.out.println(k+" "+v));
					}
					break;
				default: System.out.println("Exit");
			}
			
		}while(ch<3);
		s.close();
	}
}