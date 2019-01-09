package multithreadingAssign;

public class MultipleThreads implements Runnable 
{
	boolean flag = true;
	@Override
	public synchronized void run() 
	{
		try 
		{
			if(flag)
				System.out.println(Thread.currentThread().getName()); flag = false;
		} 
		
		catch (Exception e) 
		{		e.printStackTrace();		}		   
	}
	
	
	public static void main(String[] args) 
	{
		MultipleThreads obj = new MultipleThreads();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}