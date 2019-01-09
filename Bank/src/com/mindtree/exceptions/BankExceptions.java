package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class BankExceptions extends MyException
{
	@Override
	public String toString() {
		return "Bank Already Exists via Exception";
	}
}