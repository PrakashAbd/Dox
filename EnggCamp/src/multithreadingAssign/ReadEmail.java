package multithreadingAssign;

public class ReadEmail 
{
	public static void main(String args[])
	{
		String email[] = {"Abde","Kholi","Pandya","Dhoni","Sarkar"};
		for(int i=0;i<email.length;i++)
		{
			try 
			{
				Thread.sleep(4000);
				System.out.println(email[i]);
			}
			catch (InterruptedException e) 
			{		e.printStackTrace();			}
		}
	}
}
