package com.example.mobileshop.dao;

import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.example.mobileshop.entity.Shop;

public class DaoImpl implements Dao
{
	HibernateTemplate template;

	public DaoImpl() {
		super();
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

	@Override
	public String add(Shop shop) throws Exception 
	{
		Session session = template.getSessionFactory().openSession();
		session.save(shop);
		session.beginTransaction().commit();
			
		return "Added Successfully";
	}

	@Override
	public String delete(String id) 
	{
		Session s = template.getSessionFactory().openSession();
		s.delete(template.get(Shop.class, id));
		s.beginTransaction().commit();
	
		return "Deleted Successfully";	
	}

	@Override
	public Shop displayById(String shopId) {
		System.out.println("In Dao");
		Shop shop = template.get(Shop.class, shopId);
		System.out.println(shop.getName());
		return shop;
	}

	@Override
	public List<Shop> display() {

		return template.loadAll(Shop.class);
	}

}
