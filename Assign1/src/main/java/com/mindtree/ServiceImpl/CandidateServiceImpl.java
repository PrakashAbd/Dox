package com.mindtree.ServiceImpl;

import java.util.List;

import com.mindtree.DaoImpl.CandidateDaoImpl;
import com.mindtree.DaoImpl.ConstituencyDaoImpl;
import com.mindtree.entity.Candidates;
import com.mindtree.service.CandidateService;

public class CandidateServiceImpl implements CandidateService
{
	CandidateDaoImpl cdi = new CandidateDaoImpl();
	ConstituencyDaoImpl condi = new ConstituencyDaoImpl();
	public String insert(Candidates c) throws Exception 
	{
			if(condi.displayConstituency(c.getId()).size()==0)
				throw new Exception("ConstituencyId does not exists");
			
			cdi.insertCandidate(c);
			return "Successful";
	}
	
	public List<Candidates> display() 
	{
		return cdi.display();
	}
}