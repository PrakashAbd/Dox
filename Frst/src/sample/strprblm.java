package sample;
import java.util.Scanner;
public class strprblm 
{
	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- >0)
		{
			String s1= s.next();
			String s2 = s.next();
			String res = "";
			int i = 0;
			
			int len = (s1.length()>s2.length())? s2.length(): s1.length();  /*To get a smallest string length*/
			for(i=0;i<len;i++)
				res = res+s1.charAt(i)+s2.charAt(i);
			
		
			while(i<s1.length())											/*Remaining characters in s1 to be added*/
			{	res = res+s1.charAt(i);	++i;	}
			
			while(i<s2.length())											/*Remaining characters in s2 to be added*/
			{	res = res+s2.charAt(i); ++i;	}	

			System.out.println(res);
		}
		s.close();
	}
}