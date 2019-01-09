package com.example.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.example.dao.OrphanageDao;
import com.example.entity.Orphanage;

public class OrphanageDaoImpl implements OrphanageDao
{
	HibernateTemplate template;
	
	public OrphanageDaoImpl() {
		super();
	}
	public OrphanageDaoImpl(HibernateTemplate template) {
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
	public String add(Orphanage o) 
	{
		Session s = template.getSessionFactory().openSession();
		s.save(o);
		s.beginTransaction().commit();
		return "Inserted Successfully";
	}

	@Override
	public String delete(int orphanageId) 
	{
		Session s = template.getSessionFactory().openSession();
		s.delete(template.get(Orphanage.class, orphanageId));
		s.beginTransaction().commit();
		return "Deleted Successfully";
	}

	@Override
	public List<Orphanage> displayAll() 
	{		return template.loadAll(Orphanage.class);		}

	@Override
	public Orphanage displayById(int id) 
	{		return template.get(Orphanage.class, id);		}

}