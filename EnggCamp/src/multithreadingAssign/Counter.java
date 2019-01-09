package multithreadingAssign;

public class Counter extends Storage
{
	public void run()
	{		
			try 
			{			list.add(count++);				}
			
			catch (Exception e) 
			{			e.printStackTrace();			}
	}
}