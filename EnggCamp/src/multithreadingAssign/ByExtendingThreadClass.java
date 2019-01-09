package multithreadingAssign;

public class ByExtendingThreadClass extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
				System.out.println(Thread.currentThread().getName()+" "+i);
		}
		catch(Exception e)
		{		System.out.println(e);			}
	}
	public static void main(String args[])
	{
		ByExtendingThreadClass threadA = new ByExtendingThreadClass();
		threadA.start();
		ByExtendingThreadClass threadB = new ByExtendingThreadClass();
		threadB.start();
	}
}
