package Frst2weeks;
import java.util.Scanner;
public class OOPS 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Person[] p = new Person[5];
		System.out.println("Enter name and number of books published");
		p[0] = new Professor(s.next(),s.nextInt());
		System.out.println("Enter name and number of books published");
		p[1] = new Professor(s.next(),s.nextInt());
		System.out.println("Enter name and percentage");
		p[2] = new Student(s.next(),s.nextDouble());
		System.out.println("Enter name and number of books published");
		p[3] = new Professor(s.next(),s.nextInt());
		System.out.println("Enter name and percentage");
		p[4] = new Student(s.next(),s.nextDouble());
		
		for (int i = 0; i < p.length; i++) 
		{
			if(p[i] instanceof Professor)
			{
				 if(((Professor) p[i]).isOutstanding()) 
					 ((Professor) p[i]).print();
			}
			else
			{
				if(((Student) p[i]).isOutstanding()) 
					((Student) p[i]).display();
			}
		}
		s.close();
	}
}