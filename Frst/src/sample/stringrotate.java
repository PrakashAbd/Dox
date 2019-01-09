package sample;
import java.util.Scanner;
public class stringrotate 
{
	public static String SS(int i, int n,String s1)
	{
		String str = "";
		for(int j=i;j<n;j++)
			str += s1.charAt(j);
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- >0)
		{
			String s1 = s.next();
			String s2 = s.next();
			if(s1.length()!=s2.length())
				System.out.println(0);
			else
			{
				boolean flag = false;
				for(int i=0;i<s1.length();i++)
				{
					String s3 = SS(i,s1.length(),s1)+SS(0,i,s1);
					if(s3.equals(s2))
					{
						flag = true;
						break;
					}
				}
				System.out.println((flag)? 1 : 0);
			}
		}
		s.close();
	}
}
