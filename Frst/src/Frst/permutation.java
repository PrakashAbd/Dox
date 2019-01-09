package Frst;
import java.util.Scanner;
public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String perm = "";
		func(perm,str);
		s.close();
	}
	public static void func(String perm, String str)
	{
		if(str.length()==0)
			System.out.println(perm);
		else
		{
			for(int i=0;i<str.length();i++)
			{
				func(perm+str.charAt(i),str.substring(0,i)+str.substring(i+1,str.length()));
			}
		}
	}
}