package sample;
import java.util.Scanner;
public class charmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[][] = new int[n][n]; 
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = s.nextInt();
				if(a[i][j]<=26)
				{
					char c = (char) (a[i][j]+96);
					System.out.print(c+" ");
				}	
				else
				{	System.out.print(a[i][j]+" ");	}
			}
			System.out.println();
		}
		s.close();
	}
}