package multithreadingAssign;

public class ByImplementsRunnable implements Runnable
{
	@Override
	public void run() 
	{
		try 
		{
			for(int i=1;i<=25;i++)
				System.out.println(Thread.currentThread().getName()+" "+i);
		}
		catch(Exception e)
		{		System.out.println(e);				}
	}
	
	public static void main(String[] args) 
	{
		ByImplementsRunnable obj = new ByImplementsRunnable();
		Thread threadC = new Thread(obj);
		threadC.start();
		Thread threadD = new Thread(obj);
		threadD.start();
	}
}