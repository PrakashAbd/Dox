package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class CustomerException extends MyException
{
	@Override
	public String toString() {
		return "Customer Not exists via Exception";
	}	
}