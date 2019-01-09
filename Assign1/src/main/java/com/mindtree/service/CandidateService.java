package com.mindtree.service;

import java.util.List;
import com.mindtree.entity.Candidates;
public interface CandidateService 
{
	String insert(Candidates c) throws Exception;
	List<Candidates> display();
}
