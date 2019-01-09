package Frst2weeks;
@SuppressWarnings("serial")
class MyException extends Exception
{
	public MyException(String msg,Throwable t)
	{	super(msg,t);	}
}

public class ExceptionWrapping 
{
	static void method1() throws MyException
	{
		try {	method2();	}
		catch(Exception e)
		{
			System.out.println("Message = "+e.getMessage());
			System.out.println("Exception = "+e.getCause());
			throw new MyException("From method1", e);
		}
	}
	static void method2()
	{
		try
		{		System.out.println(10/0);	}	
		catch(ArithmeticException e)
		{
			NumberFormatException n = new NumberFormatException("From method2");
			n.initCause(e);
			throw n;
		}	
	}
	public static void main(String[] args) 
	{
		try
		{		method1();		}
		catch(Exception e)
		{
			System.out.println("Message = "+e.getMessage());
			System.out.println("Exeption = "+e.getCause());
			e.printStackTrace();
		}

	}
}