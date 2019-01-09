package implementation;
import java.util.Scanner;
public class hackerearth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string length");
		int n = s.nextInt();
		String str = s.next();
		int a[] = new int[7];
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='h')	a[0]++;
			if(str.charAt(i)=='a')	a[1]++;
			if(str.charAt(i)=='c')	a[2]++;
			if(str.charAt(i)=='k')	a[3]++;
			if(str.charAt(i)=='e')	a[4]++;
			if(str.charAt(i)=='r')	a[5]++;
			if(str.charAt(i)=='t')	a[6]++;
		}
		a[0] /= 2; a[1] /= 2; a[4] /= 2; a[5] /= 2;
		int count = a[0], ans = 0;
		for(int i=1;i<7;i++)	
			ans = (count>a[i]) ? a[i] : count;
		System.out.println(ans);
		s.close();
	}

}
