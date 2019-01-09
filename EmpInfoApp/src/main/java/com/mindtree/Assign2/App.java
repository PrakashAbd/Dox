package com.mindtree.Assign2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.hibernate.HibernateException;
import com.mindtree.ServiceImpl.DepartmentServiceImpl;
import com.mindtree.ServiceImpl.EmployeeServiceImpl;
import com.mindtree.dao.hibernateImpl.EmployeeDaoHibernateImpl;
import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;
import com.mindtree.exception.DaoException;
import com.mindtree.exception.MyException;

public class App 
{
    public static void main( String[] args ) throws ParseException, DaoException
    {
    	Scanner s = new Scanner(System.in);
    	int ch = 0;
    	do
    	{
    		System.out.println("1.Employee 2.Department 3.Exit");
    		EmployeeServiceImpl esi = new EmployeeServiceImpl();
    		ch = s.nextInt();
    		switch(ch)
    		{
    			case 1: Employee emp = new Employee();
    					System.out.println("1.AddEmployee 2.DisplayById 3.DeleteById 4.UpdateEmployee 5.Exit");
    					switch(s.nextInt())
    					{
    						case 1: System.out.println("Enter Employee Name");
    								emp.setEmpName(s.next());
    								System.out.println("Enter Date-of-Birth");
    								String str = s.next();
    								Date date=new SimpleDateFormat("dd/MM/yyyy").parse(str); 
    								emp.setDob(date);
    								System.out.println("Enter the email");
    								emp.setEmail(s.next());
    								System.out.println("Enter the salary");
    								emp.setSalary(s.nextDouble());
    								System.out.println("Enter Department Number");
    								emp.getDepartment().setDepNum(s.nextInt());
    								System.out.println("Enter Department Name");
    								emp.getDepartment().setDeptName(s.next());
    								esi.addEmployee(emp);
    								break;
    						case 2: System.out.println("Enter the Employee number");
    								int num = s.nextInt();
    								System.out.println( (esi.getEmployee(num)==null)? "Employee Number Not Found" : esi.getEmployee(num)) ;
    								break;
    						case 3: System.out.println("Enter the employee number");
    								esi.deleteEmployee(s.nextInt());
    								break;
    						case 4: System.out.println("Enter the Employee Number to be updated");
    								emp.setEmpNum(s.nextInt());
    								System.out.println("Enter Employee Name");
    								emp.setEmpName(s.next());
    								System.out.println("Enter Date-of-Birth");
    								try
    								{
	    								String str1 = s.next();
	    								Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str1); 
	    								emp.setDob(date1);
	    								System.out.println("Enter the email");
	    								emp.setEmail(s.next());
	    								System.out.println("Enter the salary");
	    								emp.setSalary(s.nextDouble());
	    								System.out.println("Enter Dep Num");
	    								emp.getDepartment().setDepNum(s.nextInt());
										esi.updateEmployee(emp);	
    								}
									catch (HibernateException e) {		System.out.println(e);		}
									catch (MyException e) 		 {		System.out.println(e);		}
    								
		    						break;
    					}
    					break;
    			case 2: Department dept = new Department();
    					DepartmentServiceImpl dsi = new DepartmentServiceImpl();
    					EmployeeDaoHibernateImpl edl = new EmployeeDaoHibernateImpl();
    					Employee e = new Employee();
    					System.out.println("1.Create 2.AddEmployee 3.DisplayEmployees in Particular Department  4.Exit");
    					switch(s.nextInt())
    					{
    						case 1: System.out.println("Enter Department Number");
    								dept.setDepNum(s.nextInt());
    								System.out.println("Enter Department Name");
    								dept.setDeptName(s.next());
    								try 				   {		dsi.createDepartment(dept);		} 
    								catch (MyException e1) {		System.out.println(e1);			}
    								break;
    						case 2: System.out.println("Enter the Employee Number");
    								e = esi.getEmployee(s.nextInt());
    								System.out.println("Enter the Department Number");
    								dept = dsi.getDeptById(s.nextInt());
    								dsi.addEmployeeToDepartment(e, dept);
    								break;
    						case 3: System.out.println("Enter the Department Number");
    								int dpt = s.nextInt();
    								edl.getEmployees().stream().filter(i -> i.getDepartment().getDepNum()==dpt).forEach(j -> System.out.println(j.getEmpNum()+" "+j.getEmpName()+" "+j.getEmail()+" "+j.getSalary()+" "+j.getDepartment().getDeptName()));   								
    								break;
    					}
    					break;
    			default: System.out.println("Exit");
    		}
    		
    	}while(ch<3);
    	s.close();
    }
}