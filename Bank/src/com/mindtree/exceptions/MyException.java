package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class MyException extends Exception
{
	@Override
	public String toString() {
		return "My Exception : ";
	}
	
}