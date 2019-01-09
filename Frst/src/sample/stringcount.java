package sample;
import java.util.Scanner;
public class stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count[] = new int[5];
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>=65 && c<=90)
				count[0]++;
			else if(c>=97 && c<=122)
				count[1]++;
			else if(c>=48 && c<=57)
				count[2]++;
			else if(c==32)
				count[3]++;
			else 
				count[4]++;
		}
		System.out.println("Number Of capital letters :  "+count[0]);
		System.out.println("Number Of small letters :  "+count[1]);
		System.out.println("Number Of digits :  "+count[2]);
		System.out.println("Number Of spaces :  "+count[3]);
		System.out.println("Number Of special characters :  "+count[4]);
		s.close();
	}
}