package multithreadingAssign;

public class MultiTasking implements Runnable
{	
	public void run()
	{		System.out.println(Thread.currentThread().getName());		}
	public static void main(String[] args) 
	{
		MultiTasking m = new MultiTasking();
		for(int i=0;i<3;i++)
		{
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		t1.setName("Thread - A");
		t2.setName("Thread - B");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		}
	}
}	