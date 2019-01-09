package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class BankCodeException extends MyException 
{
	@Override
	public String toString() {
		return "Bank Code Does Not Exists via Exception";
	}	
}