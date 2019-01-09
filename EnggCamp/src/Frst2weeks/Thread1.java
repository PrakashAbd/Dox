package Frst2weeks;

public class Thread1 extends Thread 
{
	String mid;
	int number;
	
	public Thread1() 
	{		super();			}
	
		
	public Thread1(String mid, int number) {
		super();
		this.mid = mid;
		this.number = number;
	}


	@Override
	public String toString() {
		return "Thread1 [mid=" + mid + ", number=" + number + "]";
	}


	public void run()
	{
		System.out.println("Current Thread Name : "+Thread.currentThread().getName());
	}
}