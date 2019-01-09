package Frst;
import java.util.Scanner;
public class ladder 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=0;i<num;i++)
			System.out.println("*   *\n*   *\n*****");
        
		System.out.println("*   *\n*   *");
		s.close();
	}
}
