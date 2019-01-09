package multithreadingAssign;

public class Printer extends Storage
{
	public void run()
	{
		try
		{		System.out.println(count);		}
		
		catch(Exception e)
		{		System.out.println(e);			}
	}
	
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			Storage s = new Counter();
			Storage s1 =new Printer();
			s.start();
			try {
				s.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s1.start();
		}
	}
}