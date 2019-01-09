package com.mindtree.exception;

@SuppressWarnings("serial")
public class MyException extends Exception
{
	@Override
	public String toString() {
		return "MyException Occurred";
	}
	
}
