package com.example.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.example.dao.EmployeeDao;
import com.example.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{	
	HibernateTemplate template;
	
	public EmployeeDaoImpl() {
		super();
	}

	public EmployeeDaoImpl(HibernateTemplate template) {
		super();
		this.template = template;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public String addEmployee(Employee employee) 
	{
		Session s = template.getSessionFactory().openSession();
		s.save(employee);
		s.beginTransaction().commit();
		return "Inserted Successfully";
	}


	public String deleteEmployee(String empId) 
	{	
		Session s = template.getSessionFactory().openSession();
		s.delete(template.get(Employee.class, empId));
		s.beginTransaction().commit();
	
		return "Deleted Successfully";								
	}

	
	public List<Employee> displayAll() 
	{
		return template.loadAll(Employee.class);								
	}

	
	@SuppressWarnings("deprecation")
	public String updateEmployee(Employee employee) 
	{
		template.bulkUpdate("update employee set username = ? , password=? ", employee.getUsername(),employee.getPassword());
		return "Updated Succesfully";								
	}

	
	public Employee displayById(String empId) 
	{
		return template.get(Employee.class, empId);								
	}	

}