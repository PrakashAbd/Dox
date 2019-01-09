package sample;
import java.util.Scanner;
public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = s.nextInt();
				b[j][i] = a[i][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		s.close();
	}

}
