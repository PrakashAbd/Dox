package com.mindtree.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.mindtree.entity.*;
import com.mindtree.servicesimpl.*;

public class BankApp 
{
	public static void main(String args[]) throws Exception 
	{
		Scanner s = new Scanner(System.in);
		int ch = 0;
		do
		{
			System.out.println("1.Bank 2.Customer 3.Employee 4.Exit");
			int choice = 0;
			ch = s.nextInt();
			switch(ch)
			{
			case 1:	Department bank = null;
					try {
					BankServiceImpl bs = new BankServiceImpl();
					System.out.println("1.Add 2.Getting By BankCode 3.Print Details 4.Updating detail 5.Delete 6.Exit");
					choice = s.nextInt();
					switch(choice)
					{
					case 1: System.out.println("Enter bankCode , name , ifscCode,branch");
							bank =  new Department(s.nextInt(),s.next(),s.next(),s.next());
							System.out.println(bs.addBankDetails(bank));
							break;
							
					case 2: System.out.println("Enter the bankCode ");
							int bankcode= s.nextInt();
							System.out.println((bs.getBankDetailId(bankcode).getName()==null)? "BankCode DoesNot exists" : bs.getBankDetailId(bankcode));
							break;
							
					case 3: List<Department> l = new ArrayList<Department>();
							l = bs.getAllBankDetails();
							l.stream().forEach(e -> System.out.println(e));
							break;
							
					case 4: System.out.println("Enter bankcode, name , ifscCode , Branch ");
							bank = new Department(s.nextInt(),s.next(),s.next(),s.next());
							System.out.println(bs.updateBank(bank));
							break;
							
					case 5: System.out.println("Enter the bankCode to be deleted");
				    		System.out.println(bs.deleteBankById(s.nextInt()));
				    		break;
				    		
					default: System.out.println("Exit");
					}
					}
					catch(Exception e)
					{
						System.out.println("Exception Occurred : "+e+" "+e.getCause());
					}
					break;
					
			case 2:	Customer cus = null;
			try
			{
					CustomerServiceImpl cs = new CustomerServiceImpl();
					System.out.println("1.Add 2.Getting By AccountNumber 3.Print Details 4.Updating detail 5.Delete 6.Male Percentage 7.Exit");
					choice = s.nextInt();
					switch(choice)
					{
					case 1:	cus = new Customer();
							System.out.println("Enter the AccountNumber : ");
							cus.setAccountNumber(s.nextLong());
							System.out.println("Enter the Customer Name : ");
							cus.setName(s.next());
							System.out.println("Enter the Customer Gender : " );
							cus.setGender(s.next());
							System.out.println("Enter the Customer Location : ");
							cus.setLocation(s.next());
							System.out.println("Enter the Customer PanID : ");
							cus.setPanId(s.next());
							System.out.println("Enter the Customer Date Of birth : ");
							cus.setDateOfBirth(s.next());
							System.out.println("Enter the Account CreatedOn Date");
							cus.setCreatedOn(s.next());
							System.out.println("Enter the Customer Phone Number : ");
							cus.setPhoneNumber(s.nextLong());
							Department bobj = new Department();
							cus.setBank(bobj);
							System.out.println("Enter the BankCode");
							bobj.setBankCode(s.nextInt());
							
							try					{	System.out.println(cs.addCustomer(cus));	}
							catch(Exception e)	{	System.out.println(e);	}
							break;
							
					case 2: System.out.println("Enter the CustomerId ");
							int cusId = s.nextInt();
							System.out.println((cs.getCustomerById(cusId).getName()==null)? "CustomerId DoesNot exists" : cs.getCustomerById(cusId));
							break;
							
					case 3: List<Customer> l = new ArrayList<Customer>();
							l = cs.getAllcustomer();
							l.stream().forEach(e -> System.out.println(e));
							break;
							
					case 4: cus = new Customer();
							System.out.println("Enter the AccountNumber : ");
							cus.setAccountNumber(s.nextLong());
							System.out.println("Enter the Customer Name : " );
							cus.setName(s.next());
							System.out.println("Enter the Customer Gender : " );
							cus.setGender(s.next());
							System.out.println("Enter the Customer Location : ");
							cus.setLocation(s.next());
							System.out.println("Enter the Customer PanID : ");
							cus.setPanId(s.next());
							System.out.println("Enter the Customer Date Of birth : ");
							cus.setDateOfBirth(s.next());
							System.out.println("Enter the Account CreatedOn Date");
							cus.setCreatedOn(s.next());
							System.out.println("Enter the Customer Phone Number : ");
							cus.setPhoneNumber(s.nextLong());
							Department bob = new Department();
							cus.setBank(bob);
							System.out.println("Enter the BankCode");
							bob.setBankCode(s.nextInt());
							System.out.println(cs.updateCustomerById(cus));
							break;
							
					case 5: System.out.println("Enter the AccountNumber to be deleted");
		    				System.out.println(cs.deleteCustomer(s.nextInt()));
		    				break;
		    				
					case 6: System.out.println("Male Percentage : "+cs.calculatePercentage()+"%");
							break;
		    				
					default: System.out.println("Exit");
					}
			}
			catch(Exception e)
			{	System.out.println("Exception Occurred : "+e+" "+e.getCause()); 	}
					break;
			
			case 3: Employee e = null;
			try
			{
					EmployeeServiceImpl es = new EmployeeServiceImpl();
					System.out.println("1.Add 2.Getting By EmpId 3.Print Details 4.Updating detail 5.Delete 6.Highest Salary 7.Getting Employee By Department 8.Exit");
					choice = s.nextInt();
					switch(choice)
					{
					case 1: e =  new Employee();
							System.out.println("Enter the EmpID : ");
							e.setEmpId(s.nextInt());
							System.out.println("Enter the Employee Name : ");
							e.setName(s.next());
							System.out.println("Enter the Employee Salary : ");
							e.setSalary(s.nextDouble());
							System.out.println("Enter the Employee Department : ");
							e.setDepartment(s.next());
							System.out.println("Enter the Employee Designation : ");
							e.setDesignation(s.next());
							System.out.println("Enter the Employee Gender : ");
							e.setGender(s.next());
							System.out.println("Enter the Date Of Joining");
							e.setDateOfJoining(s.next());
							Department bobj = new Department();
							e.setBank(bobj);;
							System.out.println("Enter the BankCode");
							bobj.setBankCode(s.nextInt());
							try					{	System.out.println(es.addEmployee(e));	}
							catch(Exception e1)	{	System.out.println(e1);					}
							break;
							
					case 2: System.out.println("Enter the EmpID ");
							int empId = s.nextInt();
							System.out.println((es.getEmployee(empId).getName()==null)? "CustomerId DoesNot exists" : es.getEmployee(empId));
							break;
							
					case 3: List<Employee> l = new ArrayList<Employee>();
							l = es.getAllEmployee();
							l.stream().forEach(e1 -> System.out.println(e1));
							break;
							
					case 4: e =  new Employee();
							System.out.println("Enter the EmpID : ");
							e.setEmpId(s.nextInt());
							System.out.println("Enter the Employee Name : ");
							e.setName(s.next());
							System.out.println("Enter the Employee Salary : ");
							e.setSalary(s.nextDouble());
							System.out.println("Enter the Employee Department : ");
							e.setDepartment(s.next());
							System.out.println("Enter the Employee Designation : ");
							e.setDesignation(s.next());
							System.out.println("Enter the Employee Gender : ");
							e.setGender(s.next());
							System.out.println("Enter the Date Of Joining : ");
							e.setDateOfJoining(s.next());
							Department bob1 = new Department();
							e.setBank(bob1);
							System.out.println("Enter the BankCode : ");
							bob1.setBankCode(s.nextInt());
							System.out.println(es.updateEmployee(e));
							break;
							
					case 5: System.out.println("Enter the EmpId to be deleted");
		    				System.out.println(es.deleteEmployee(s.nextInt()));
		    				break;
							
					case 6: List<Employee> emp = es.getAllEmployee();
							e = emp.stream().max( (Employee e1,Employee e2) -> e1.getSalary()>e2.getSalary() ? 1 : -1).get();
							System.out.println(e);
							break;
							
					case 7: List<Employee> em = es.getAllEmployee();
							System.out.println("Enter the department ");
							String dept = s.next();
							em.stream().filter( (Employee ob) -> ob.getDepartment().equals(dept)).forEach((Employee e1) -> System.out.println(e1));
							break;
					default: System.out.println("Exit");
					}
			}
			catch(Exception e1)
			{	System.out.println("Exception Occurred : "+e1+" "+e1.getCause());		}
			break;	
			default: System.out.println("Exit");
			}
		}while(ch<4);
		s.close();
	}
}