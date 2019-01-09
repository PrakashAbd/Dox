package Frst;
import java.util.Scanner;
public class str 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				System.out.print(i+1+" ");				//Calculating number of spaces 
				count++;
			}
		}
		String s2 = "";
		String s1[] = new String[count+1];
		int a = 0;
		for(int i=0;i<str.length();i++)					//Split the string and stored in String array
		{
			if(str.charAt(i)==' ')
			{
				s1[a++] = s2;
				s2 = "";
			}
			else
				s2 +=str.charAt(i);
		}
		s1[a++] = s2;
		System.out.println();
		
		for(int i=0;i<s1.length;i++)					//Traversing String array
		{
			s2 = ""; 
			boolean flag = false;
			int k = i+1;
			for(int j=2;j<k;j++)						//Find the prime index
			{
				if(k%j==0)
				{	flag = true;	break;	}
			}
			if(flag!=true && k!=1)
			{
				for(int q=s1[i].length()-1;q>=0;q--)	//Reverse the string in prime index
					s2 += s1[i].charAt(q);
				s1[i] = s2;	
			}
		}
		for(int i=0;i<s1.length;i++)					
			System.out.print(s1[i]+" ");				//Printing the string array
		
		s.close();
	}
}