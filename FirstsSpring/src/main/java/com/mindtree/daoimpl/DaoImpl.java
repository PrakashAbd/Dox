package com.mindtree.daoimpl;
import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import com.mindtree.dao.EmployeeDao;
import com.mindtree.entity.Employee;


public class DaoImpl implements EmployeeDao
{
	HibernateTemplate template;
		
	public DaoImpl() {
		super();
		template = new HibernateTemplate();
	}
	public DaoImpl(HibernateTemplate template) {
		super();
		this.template = template;
	}
	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public String addEmployee(Employee e) 
	{
		Session session = template.getSessionFactory().openSession();
		session.save(e);
		session.beginTransaction().commit();
		//template.save(e);
		return "Employee added successfully";
	}

	public String deleteEmployee(Employee e) throws Exception 
	{
		Session session = template.getSessionFactory().openSession();
		try 
		{
			session.delete(e);
			session.beginTransaction().commit();
		}
		catch(Exception e1)
		{
			throw new Exception();
		}
		
		return "Employee deletd successfully";
	}

	public List<Employee> displayEmployee() 
	{
		return template.loadAll(Employee.class);
	}

	public String updateEmployee(Employee e) 
	{
		template.bulkUpdate("update Employee set username = ?, password = ? where id = ?",e.getUsername(),e.getPassword(),e.getEmpId());
		return "Updated Successfully";
	}

	public Employee displayById(int id) 
	{
		return template.get(Employee.class, id);
	}
}