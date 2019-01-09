package sample;
import java.util.Scanner;
public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[] = {9,2,7,4,6,3};
		for(int i=0;i<a.length-1;i++)
		{
			int index = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
					index = j;
			}
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
			
			for(int k: a)
				System.out.print(k+" ");
			
			System.out.println();
		}
		s.close();
	}

}
