package multithreadingAssign;

public class ThreadDemo extends Thread
{
	public void run()
	{
		synchronized(this){
		for(int i=0;i<10;i++)
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) 
	{
		ThreadDemo t1 = new ThreadDemo();
		
		ThreadDemo t2 = new ThreadDemo();
		
		ThreadDemo t3 = new ThreadDemo();
		
		t3.start();
		t1.start();
		t2.start();
	}
}