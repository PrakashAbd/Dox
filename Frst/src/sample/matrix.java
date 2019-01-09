package sample;
import java.util.Scanner;
public class matrix
{
	
	public static void get(int n,int m)
	{
		Scanner s = new Scanner(System.in);
		int a[][] = new int[n][m];
		boolean flag = true;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				a[i][j] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j && a[i][j]!=1)
				{	flag = false; break;	}
				
				else if(i!=j && a[i][j]!=0)
				{	flag = false;	break;	}
			}
		}
		System.out.println((flag)? "Identity matrix" : "Not a identity matrix");
		s.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		if(n!=m)
			System.out.println("Rows and columns are not equal");
		else
			get(n,m);
		
		s.close();
	}

}
