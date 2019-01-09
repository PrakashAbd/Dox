package Frst;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int count1 = 0 , count2 = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println(ch);
				count1++;
			}
			else
			{
				count2++;
			}
		}
		System.out.println("Vowels : "+ count1 + "\nConstants : " +count2);
		s.close();
	}

}
