package com.example.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.example.dao.UserDao;
import com.example.entity.User;

public class UserDaoImpl implements UserDao
{
	HibernateTemplate template;
	
	public UserDaoImpl() {
		super();
	}

	public UserDaoImpl(HibernateTemplate template) {
		super();
		this.template = template;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public String addUser(User u) 
	{
		Session s = template.getSessionFactory().openSession();
		s.save(u);
		s.beginTransaction().commit();
		return "Inserted Successfully";
	}

	@Override
	public String deleteUser(int id) 
	{
		Session s = template.getSessionFactory().openSession();
		s.delete(template.get(User.class, id));
		s.beginTransaction().commit();
		return "Deleted Successfully";
	}

	@SuppressWarnings("deprecation")
	@Override
	public String updateUser(User u) 
	{
		template.bulkUpdate("update employee set username = ? , password=? ", u.getUsername(),u.getPassword());
		return "Updated Succesfully";
	}

	@Override
	public User displayByid(int id) 
	{		return template.get(User.class, id);		}

	@Override
	public List<User> displayAll() 
	{		return template.loadAll(User.class);		}
}