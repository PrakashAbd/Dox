package multithreadingAssign;

public class SingleTasking implements Runnable
{
	public void run() 
	{	
		func1();
		func2();
		func3();
	}
	
	public void func1()
	{		System.out.println("Function 1");			}
	
	public void func2()
	{		System.out.println("Function 2");			}
	
	public void func3()
	{		System.out.println("Function 3");			}
	
	public static void main(String[] args) 
	{
		SingleTasking obj = new SingleTasking();
		Thread threadA = new Thread(obj);
		threadA.start();
	}
}