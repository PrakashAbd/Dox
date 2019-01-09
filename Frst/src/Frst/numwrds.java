package Frst;
import java.util.Scanner;
public class numwrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = 1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) ==' ')
				count++;
		}
		System.out.println(count);
		s.close();
	}

}
