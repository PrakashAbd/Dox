package sample;
import java.util.Scanner;
public class stringarray 
{
	public static int compareTo(String s1,String s2)
	{
		int len = (s1.length()>s2.length())? s2.length() : s1.length();
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				continue;
			else if(s1.charAt(i)>s2.charAt(i))
				return 1;
			else
				return -1;
		}
		if(s1.length()>s2.length())
			return 1;
		return 0;
	}
	public static boolean search(String a[],String key)
	{
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if(compareTo(key,a[i])==0)
			{	flag = true;	break;		}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str[] = {"welcome","to","mindtree","welcome","to","possible"};
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=0;j<str.length-i-1;j++)
			{	
				if(compareTo(str[j],str[j+1])>0)
				{
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(String st1: str)
			System.out.print(st1+" ");
		
		System.out.println("\nEnter the string to be searched");
		System.out.println((search(str,s.next()))? "Found" : "Not Found");
		
		s.close();
	}
}