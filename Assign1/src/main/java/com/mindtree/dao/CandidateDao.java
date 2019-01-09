package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Candidates;

public interface CandidateDao 
{
	String insertCandidate(Candidates c);
	List<Candidates> display();
}
