package Frst2weeks;
class Customer
{
	int amt = 10000;
	synchronized void deposit(int amt)
	{
		this.amt += amt;
		System.out.println("Amount deposited");
		notify();
	}
	synchronized void withdraw(int amt) throws InterruptedException
	{
		if(this.amt<amt)
		{
			//System.out.println("Insufficient Balance");
			wait();
			System.out.println("Amount withdrawn successfully");
		}
	}
}
public class communicationBTthreads 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		new Thread()
		{	public void run()	
			{	
				try {		c.withdraw(20000);	}
				catch (InterruptedException e) {}
			}
		}.start();
		new Thread()
		{	public void run()	{	c.deposit(15000);	}}.start();

	}
}