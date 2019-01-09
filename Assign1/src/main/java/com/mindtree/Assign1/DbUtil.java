package com.mindtree.Assign1;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import com.mindtree.entity.Candidates;
import com.mindtree.entity.Constituency;

public class DbUtil 
{
		public static Session getSession() 
		{
			Session ss = new Configuration().configure().addAnnotatedClass(Constituency.class).addAnnotatedClass(Candidates.class).buildSessionFactory().openSession();
			return ss; 
		}
}