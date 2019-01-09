package multithreadingAssign;

import java.util.LinkedList;

public class ProducerConsumer 
{
	LinkedList<Integer> list = new LinkedList<Integer>();
	int bufferSize = 1;
	void producer()
	{
		int ans = 0;
		for(int i=0;i<3;i++)
		{
			synchronized(this)	{
			try 
			{
				if(list.size()==bufferSize)
					wait();
					
				System.out.println("Producer : "+ ans);
				list.add(ans++);
				notify();
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			}
		}
	}
	
	void consumer()
	{
		for(int i=0;i<3;i++)
		{
			synchronized(this)	{
			try 
			{
				if(list.size()==0)
					wait();
				System.out.println("Consumer : "+ list.removeFirst());
				notify();
			}
			catch (InterruptedException e) 
			{
					e.printStackTrace();
			}	
			}
		}
	}
}
