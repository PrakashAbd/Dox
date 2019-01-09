package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Constituency;

public interface ConstituencyDao 
{
	String insertConstituency(Constituency con) throws Exception;
	List<Constituency> displayConstituency(int id);
	List<Constituency> display();
}