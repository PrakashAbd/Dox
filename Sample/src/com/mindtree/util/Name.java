package com.mindtree.util;

import java.util.Comparator;
import com.mindtree.entity.Employee;

public class Name implements Comparator<Employee> 
{
	public int compare(Employee e1, Employee e2) 
	{
		return e1.getName().compareTo(e2.getName());
	}
}