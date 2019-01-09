package implementation;
import java.util.Scanner;
public class amanndhisbrthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		boolean flag = false;
		while(a<=b)
		{
			if(a==b)
				flag = true;
			a += c;
		}
		System.out.println((flag)? "YES" : "NO");
		s.close();
	}
}