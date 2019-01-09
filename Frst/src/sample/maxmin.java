package sample;
import java.util.Arrays;
import java.util.Scanner;
public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[] = {10,4,12,6,8,3,5,2};
		Arrays.sort(a);
		int b[] = new int[a.length];
		int k=0;
		for(int i=0,j=a.length-1;i<=j;i++,j--)
		{
			b[k++] = a[j];
			b[k++] = a[i];
		}
		for(int i: b)
			System.out.println(i);
		s.close();
	}
}