package Frst;
import java.util.Scanner;
public class Aman 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		int count = 0;
		while(q-- >0)
		{
			int r = s.nextInt();
			int h = s.nextInt();
			if((3.14*2*r)<(h*100))
				count++;
		}
		System.out.println(count);
		s.close();
	}
}
