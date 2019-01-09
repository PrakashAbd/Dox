package com.mindtree.dao.hibernateImpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.mindtree.Assign2.DbUtil;
import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.Employee;

public class EmployeeDaoHibernateImpl implements EmployeeDao
{
	Employee emp = new Employee();
	public int addEmployee(Employee employee) 
	{
		Session session = DbUtil.getConnection();
		Transaction tranx = session.beginTransaction();
		session.save(employee);
		tranx.commit();
		session.close();
		return 1;
	}
	
	public Employee getEmployee(int empNum) 
	{
		Session session = DbUtil.getConnection();
		Transaction tranx = session.beginTransaction();
		emp =  session.get(Employee.class,empNum);
		tranx.commit();
		session.close();
		return emp;
	}

	public void deleteEmployee(int empNum) 
	{
		Employee e = getEmployee(empNum);
		Session session = DbUtil.getConnection();
		Transaction tranx = session.beginTransaction();
		session.delete(e);
		tranx.commit();
		session.close();
	}
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployees() 
	{
		Session session = DbUtil.getConnection();
		return session.createQuery("from Employee").list();
	}

	public void updateEmployee(Employee e) 
	{
		Session session = DbUtil.getConnection();
		Transaction tranx = session.beginTransaction();
		session.update(e);
		tranx.commit();
		session.close();
	}
}