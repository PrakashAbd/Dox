package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class DepartmentException extends MyException
{
	@Override
	public String toString() {
		return "Department Id does not exists";
	}
	
}
