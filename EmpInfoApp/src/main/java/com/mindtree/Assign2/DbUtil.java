package com.mindtree.Assign2;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mindtree.entity.Department;
import com.mindtree.entity.Employee;

public class DbUtil 
{
	public static Session getConnection()
	{
		Session ss = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory().openSession();
		return ss; 
	}
}