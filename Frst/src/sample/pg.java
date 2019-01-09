package sample;
import java.util.Scanner;
class cus
{
	int per;
	String name,id,qual;
	cus(String id,String name,String qual,int per)
	{
		this.id = id;
		this.qual = qual;
		this.name = name;
		this.per = per;
	}
	
}
public class pg 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of campus minds");
		int n = s.nextInt();
		cus c[] = new cus[n];
		System.out.println("Enter customer id, name, qualification and percentage ");
		for(int i=0;i<n;i++)
			c[i] = new cus(s.next(),s.next(),s.next(),s.nextInt());
		System.out.println("Enter 1. Average percentage  2. Customer details ");
		int k = s.nextInt();
		switch(k)
		{
			case 1:	int sum = 0;
					for(int i=0;i<n;i++)
						sum += c[i].per;
					System.out.println("Average Percentage is "+ (sum/5));
					break;
					
			case 2: 
					for(int i=0;i<n;i++)
					{
						for(int j=i+1;j<n;j++)
						{
								if(c[i].per<c[j].per)
								{
									cus e = c[i];
									c[i] = c[j];
									c[j] = e;
								}
						}
					}
					for(int q=0;q<5;q++)
						System.out.println(c[q].id+"  "+c[q].name +"  "+c[q].qual+"  "+c[q].per);
					break;
		}
		s.close();
	}
}
