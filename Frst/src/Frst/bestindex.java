package Frst;
import java.util.Scanner;
public class bestindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = s.nextInt();
		
		int sum = 0, count = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				count += a[i];
			}
			if(count>sum)
				sum = count;
		}
		System.out.println(sum);
		s.close();
	}

}
