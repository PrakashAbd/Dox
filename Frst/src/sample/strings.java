package sample;
import java.util.Scanner;
public class strings
{
	public static String odd(String str)
	{
		String s1 = "";
		for(int i=0;i<str.length();i+=2)
		{
			char ch = str.charAt(i);
			if(ch!=' ')
				s1 += ch;
		}	
		return s1;
	}
	public static String even(String str)
	{
		String s2 = "";
		for(int i=1;i<str.length();i+=2)
		{
			char ch = str.charAt(i);
			if(ch!=' ')
				s2 += ch;
		}	
		return s2;
	}
	public static void merge(String a,String b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String a = odd(str);
		String b = even(str);
		merge(a,b);
		s.close();
	}

}
