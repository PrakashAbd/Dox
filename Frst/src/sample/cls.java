package sample;
import java.util.Scanner;
class Employee 
{
	int rating;
	String name,id;
	long mob;	
	Employee(String id,String name,long mob, int rating)
	{
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.rating = rating;
	}
}
public class cls 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n = s.nextInt();
		Employee a[] = new Employee[n];
		for(int i=0;i<n;i++)
			a[i] = new Employee(s.next(),s.next(),s.nextLong(),s.nextInt());
		
		for(int i=0;i<n;i++)
		{
			Employee e = null;
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j].id.compareTo(a[j+1].id)>0)
				{
					e = a[j];
					a[j] = a[j+1];
					a[j+1] = e;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i].id+"  " +a[i].name+"  "+a[i].mob +"  " +a[i].rating);
		s.close();
	}
}