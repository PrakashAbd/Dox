package Frst2weeks;

import java.io.IOException;

class Ex implements Runnable
{
	synchronized void m1()	
	{
		n1();
		System.out.println("M1 method");
	}
	synchronized void n1()
	{
		System.out.println("N1 method");
	}
	public void run()
	{
		m1();
		synchronized(this)
		{
		try 
		{
			for (int i = 0; i < 5; i++) 
			{
				System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority() );
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) 
		{	e.printStackTrace();		}
	}
	}
}
public class ThreadEg 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Ex e = new Ex();
		System.out.println(Runtime.getRuntime().totalMemory());
		//Runtime.getRuntime().exec("notepad");
		Thread t1 = new Thread(e);
		t1.setName("Thread 1");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setDaemon(true);
		t1.start();
		Thread t2 = new Thread(e);
		t2.setName("Thread 2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		//System.out.println(Runtime.getRuntime().freeMemory());
		//System.out.println(Runtime.getRuntime().totalMemory());
//		while(t1.isAlive())
//		{
//			System.out.println("Main Thread");
//			Thread.sleep(1000);
//		}
	}
}