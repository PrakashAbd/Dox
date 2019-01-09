package com.mindtree.dao.hibernateImpl;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.mindtree.Assign2.DbUtil;
import com.mindtree.dao.DepartmentDao;
import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;
import com.mindtree.exception.MyException;

public class DepartmentDaoHibernateImpl implements DepartmentDao
{
	EmployeeDaoHibernateImpl edl = new  EmployeeDaoHibernateImpl();
	Department d = new Department();
	public void createDepartment(Department dept) throws MyException 
	{
		try
		{
			Session ss = DbUtil.getConnection();
			Transaction tranx = ss.beginTransaction();
			ss.save(dept);
			tranx.commit();
			ss.close();
		}
		catch(Exception e)
		{
			throw new MyException();
		}
	}

	public void addEmployeeToDepartment(Employee emp, Department dept) 
	{
		Session ss = DbUtil.getConnection();
		try
		{
			dept.getEmployee().add(emp);
			ss.update(dept);
		}
		catch(Exception e)	{		System.out.println("Exception Occur");		}
		
		Transaction tranx = ss.beginTransaction();
		tranx.commit();
		ss.close();
	}

	public void RemoveEmployeeFromDepartment(Employee emp, Department dept) 
	{
		Session ss = DbUtil.getConnection();
		try
		{
			ss.delete(emp);
		}
		catch(Exception e)	{		System.out.println("Exception Occur");		}
		
		Transaction tranx = ss.beginTransaction();
		tranx.commit();
		ss.close();
	}

	public Department getDeptById(int deptNum) 
	{
		Session session = DbUtil.getConnection();
		Transaction tranx = session.beginTransaction();
		d =  session.get(Department.class,deptNum);
		tranx.commit();
		session.close();
		return d;
	}
}