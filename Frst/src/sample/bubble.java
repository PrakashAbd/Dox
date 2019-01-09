package sample;
import java.util.Scanner;
public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a[]= new int[num];
		for(int i=0;i<num;i++)
			a[i] = s.nextInt();
		for(int i=0;i<num-1;i++)
		{
			for(int j = 0;j<num-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println(i+" pass :  ");
			for(int k=0;k<num;k++)
				System.out.print(a[k]+"  ");
			System.out.println();
		}
		s.close();
	}

}
