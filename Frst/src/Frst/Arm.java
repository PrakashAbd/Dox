package Frst;
import java.util.Scanner;
public class Arm 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int res = num;
		int rem = 0,sum = 0;
		while(num>0)
		{
			rem = num%10;
			num /= 10;
			sum += rem*rem*rem;
		}
		System.out.println((sum==res)? "YES" : "NO");
		s.close();
	}
}