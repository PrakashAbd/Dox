package Frst;
import java.util.Scanner;
public class ascii {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String ch = s.next();
		
		for(int i=0;i<ch.length();i++)
			System.out.println((int) ch.charAt(i));
		
		s.close();
	}
}