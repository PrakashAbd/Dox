package com.mindtree.DaoImpl;
import java.util.List;
import org.hibernate.Session;
import com.mindtree.Assign1.DbUtil;
import com.mindtree.dao.ConstituencyDao;
import com.mindtree.entity.Constituency;

public class ConstituencyDaoImpl implements ConstituencyDao
{
	public String insertConstituency(Constituency con) throws Exception
	{
		Session session = DbUtil.getSession();
		org.hibernate.Transaction tranx = session.beginTransaction();
		try {
		session.save(con);
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		tranx.commit();
		session.close();
		return "Inserted";
	}

	@SuppressWarnings("unchecked")
	public List<Constituency> displayConstituency(int id) 
	{
		Session ss =DbUtil.getSession();
		return ss.createQuery("from Constituency where id = "+id).list();
	}

	@SuppressWarnings("unchecked")
	public List<Constituency> display() 
	{
		Session ss = DbUtil.getSession();
		return ss.createQuery("from Constituency").list();
	}
}