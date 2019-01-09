package com.mindtree.firstsspring;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.daoimpl.DaoImpl;
import com.mindtree.entity.Employee;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
    	Scanner s = new Scanner(System.in);
    	DaoImpl obj = (DaoImpl)ac.getBean("d");
    	int ch = 0;
    	do
    	{
    		Employee e = new Employee();
    		System.out.println("1.Add 2.Delete 3.Update 4.Display By EmpId 5.Display 6.Exit");
    		ch = s.nextInt();
    		switch(ch)
    		{
    			case 1: System.out.println("Enter the Employee Name");
    					e.setUsername(s.next());
    					System.out.println("Enter the Employee Password");
    					e.setPassword(s.next());
    					obj.addEmployee(e);
    					break;
    			case 2: System.out.println("Enter the EmpId to be deleted");
    					e.setEmpId(s.nextInt());
    					try {				obj.deleteEmployee(e);		} 
						catch (Exception e1) {	System.out.println(e1);	}
    					break;
    			case 3: System.out.println("Enter the Employee Id");
    					e.setEmpId(s.nextInt());
    					System.out.println("Enter the employee name");
    					e.setUsername(s.next());
    					System.out.println("Enter the Employee Password");
    					e.setPassword(s.next());
    					System.out.println(obj.updateEmployee(e));
    					break;
    			case 4: System.out.println("Enter the EmpId you want to dispay");
    					System.out.println(obj.displayById(s.nextInt()));
    					break;
    			case 5: System.out.println(obj.displayEmployee());
    					break;
    			default: System.out.println("Exit");
    		}
    	}while(ch<6);
    	s.close();
    }
}