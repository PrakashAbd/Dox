package sample;
import java.util.Scanner;
public class matrixmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size for matrices 1 and 2");
		int n = s.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j] = s.nextInt();
		}
		int b[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				b[i][j] = s.nextInt();
		}
			int c[][] = new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int k=0;k<n;k++)
						c[i][j] += a[i][k]*b[k][j];
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
					System.out.print(c[i][j]+" ");
				System.out.println();
			}			
			s.close();
		}
	}
