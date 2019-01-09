package com.mindtree.ServiceImpl;
import java.util.List;

import com.mindtree.DaoImpl.ConstituencyDaoImpl;
import com.mindtree.entity.Constituency;
import com.mindtree.service.ConstituencyService;

public class ConstituencyServiceImpl implements ConstituencyService
{
	ConstituencyDaoImpl condi = new ConstituencyDaoImpl();
	public String insert(Constituency con) throws Exception 
	{
		return condi.insertConstituency(con);
	}
	
	public List<Constituency> display(int id) 
	{
		return condi.displayConstituency(id);
	}
	
	public List<Constituency> display() 
	{
		return condi.display();
	}
}