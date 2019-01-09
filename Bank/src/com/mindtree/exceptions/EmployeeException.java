package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class EmployeeException extends MyException
{

	@Override
	public String toString() {
		return "Employee not exists via Exception";
	}
	
}
