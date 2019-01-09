package sample;
import java.util.Scanner;
public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a[] = new int[num];
		for(int i=0;i<num;i++)
			a[i] = s.nextInt();
		
		for(int i=1;i<num;i++)
		{
			int k = a[i];
			int j = i-1;
			while(j>=0 && a[j]>k)
			{
				a[j+1] = a[j];
				j=j-1;
			}
			a[j+1] = k;
		}
		for(int i=0;i<num;i++)
			System.out.println(a[i]);
		s.close();
	}

}
