package multithreadingAssign;

public class MultipleThread implements Runnable 
{
	static int count = 0; 
	public synchronized void run()
	{
		try 
		{
			count = count+1;
			for(int i=0;i<5;i++)
				System.out.println(i);
			
			System.out.println(Thread.currentThread().getName());	
		}
		catch(Exception e)
		{	System.out.println(e);		}
	}
	public static void main(String[] args) 
	{
		
		MultipleThread obj = new MultipleThread();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		//Thread t3 = new Thread(obj);
		
		t1.start();
		t2.start();
		//t3.start();
	}
}