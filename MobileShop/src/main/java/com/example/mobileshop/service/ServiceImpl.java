package com.example.mobileshop.service;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.mobileshop.dao.DaoImpl;
import com.example.mobileshop.entity.Shop;

public class ServiceImpl implements Service
{
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	DaoImpl dao = con.getBean("a",DaoImpl.class);
	
	@Override
	public String add(Shop shop) throws Exception 
	{
		try	{
			System.out.println(shop.getName());
			return dao.add(shop);	
		}
		catch(Exception e)	{
			throw new Exception(e);
		}	
	}

	@Override
	public String delete(String id) throws Exception 
	{
		try	{
			return dao.delete(id);
		}catch(Exception e)	{
			throw new Exception(e);
		}
	}

	@Override
	public Shop displayById(String id) throws Exception 
	{
		try	{
			return dao.displayById(id);
		}catch(Exception e)	{
			System.out.println(e);
			throw new Exception(e);
		}
	}

	@Override
	public List<Shop> display() throws Exception 
	{
		try	{
			return dao.display();
		}catch(Exception e)	{
			throw new Exception();
		}
	}

}
