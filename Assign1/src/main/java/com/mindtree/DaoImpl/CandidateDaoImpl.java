package com.mindtree.DaoImpl;
import java.util.List;
import org.hibernate.Session;
import com.mindtree.Assign1.DbUtil;
import com.mindtree.dao.CandidateDao;
import com.mindtree.entity.Candidates;

public class CandidateDaoImpl implements CandidateDao
{
	public String insertCandidate(Candidates c) 
	{
		Session session = DbUtil.getSession();
		org.hibernate.Transaction tranx = session.beginTransaction();
		session.save(c);
		tranx.commit();
		session.close();
		return "Inserted Successfully";
	}
	@SuppressWarnings("unchecked")
	public List<Candidates> display()
	{
		Session s1 = DbUtil.getSession();
		return s1.createQuery("from Candidates").list();
		
	}
}