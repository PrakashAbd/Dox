package sample;
import java.util.Scanner;
class Customer
{
	String name;
	int item;
	float amt;
	public Customer(String name, int item, float amt) {
		super();
		this.name = name;
		this.item = item;
		this.amt = amt;
	}

	void bubblesort(String s1,String s2)
	{
		
	}
}

public class cust 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Customer c[] = new Customer[3];
		for(int i=0;i<3;i++)
			c[i] = new Customer(s.next(),s.nextInt(),s.nextFloat());
		
		System.out.println("1.Bubble sort 2. Insertion sort 3.Selection sort");
		int n = s.nextInt();
		switch(n)
		{
		case 1: 
				break;
		case 2:
				break;
		case 3: 
				break;
		default:
		}
		s.close();
	}

}
