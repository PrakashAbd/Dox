package com.mindtree.exception;

@SuppressWarnings("serial")
public class DaoException extends MyException
{
	@Override
	public String toString() 
	{
		return "Employee Number Not Found";
	}
}