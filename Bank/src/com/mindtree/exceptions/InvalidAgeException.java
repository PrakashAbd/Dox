package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class InvalidAgeException extends MyException {

	@Override
	public String toString() {
		return "Age is below 18" ;
	}

}
