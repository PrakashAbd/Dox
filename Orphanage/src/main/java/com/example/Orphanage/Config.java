package com.example.Orphanage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.daoimpl.OrphanageDaoImpl;
import com.example.daoimpl.UserDaoImpl;
import com.example.entity.Orphanage;
import com.example.entity.User;
import com.example.serviceimpl.OrphanageServiceImpl;
import com.example.serviceimpl.UserServiceImpl;

@Configuration
public class Config 
{
	static ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	
	public static UserDaoImpl getUserDao()
	{		return con.getBean("userDao",UserDaoImpl.class);						}
	
	public static OrphanageDaoImpl getOrphanageDao()
	{		return con.getBean("orphanageDao",OrphanageDaoImpl.class);				}

	public static UserServiceImpl getUserService()
	{		return con.getBean("userService",UserServiceImpl.class);				}
	
	public static OrphanageServiceImpl getOrphanageService()
	{		return con.getBean("orphanageService",OrphanageServiceImpl.class);		}
	
	public static Orphanage getOrphanage()
	{		return con.getBean("orphanage",Orphanage.class);						}
	
	public static User getUser()
	{		return con.getBean("user",User.class);									}
}