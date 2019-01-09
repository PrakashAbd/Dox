package com.mindtree.exceptions;

@SuppressWarnings("serial")
public class AppException extends Exception 
{
	public AppException() {
		super();	
	}

	public AppException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public AppException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public AppException(String arg0) {
		super(arg0);

	}

	public AppException(Throwable arg0) {
		super(arg0);

	}
	
}
