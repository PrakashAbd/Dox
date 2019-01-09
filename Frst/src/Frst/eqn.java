package Frst;
import java.util.Scanner;
public class eqn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = (b*b)-(4*a*c);
		if(d>0)
		{
			int neg = (int)Math.abs((-b + Math.sqrt(d))/(2*a));
			int pos = (int)Math.abs((-b - Math.sqrt(d))/(2*a));
			System.out.println(pos+"\n"+ neg);
		}
		else
			System.out.println("Roots are imaginary");
		s.close();
	}

}
