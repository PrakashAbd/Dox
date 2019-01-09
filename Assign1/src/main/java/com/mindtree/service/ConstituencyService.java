package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Constituency;

public interface ConstituencyService 
{
	String insert(Constituency con) throws Exception;
	List<Constituency> display();
}
