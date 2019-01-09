package com.example.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.daoimpl.EmployeeDaoImpl;
import com.example.serviceimpl.EmployeeServiceImpl;
import com.example.serviceimpl.LoginServiceImpl;
import com.example.daoimpl.LoginDaoImpl;
import com.example.entity.Login;

@Configuration
public class Config 
{
	static ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	
	public static EmployeeDaoImpl getEmployeeDao()
	{		return con.getBean("empDao",EmployeeDaoImpl.class);				}
	
	
	public static EmployeeServiceImpl getEmployeeService()
	{		return con.getBean("empService",EmployeeServiceImpl.class);		}
	
	public static LoginDaoImpl getLoginDao()
	{		return con.getBean("loginDao",LoginDaoImpl.class);				}
	
	
	public static LoginServiceImpl getLoginService()
	{		return con.getBean("loginService",LoginServiceImpl.class);		}
	
	public static Login getLogin()
	{		return con.getBean("log",Login.class);		}
	
}