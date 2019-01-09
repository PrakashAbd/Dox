package Frst;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String s1 = "";
		for(int i=str.length()-1;i>=0;i--)
			s1 += str.charAt(i);
		
		System.out.println(s1);
		s.close();
	}
}
