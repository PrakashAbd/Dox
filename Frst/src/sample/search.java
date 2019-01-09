package sample;
import java.util.Scanner;
public class search {
	public static boolean compute(int a[],int n,int l,int k)
	{
		if(l>=1)
		{
			int mid = n+(l-1)/2;
			if(a[mid]==k)
				return true;
			if(a[mid]<k)
				return compute(a,mid+1,l,k);
			else
				return compute(a,0,mid-1,k);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a[] = new int[num];
		for(int i=0;i<num;i++)
			a[i] = s.nextInt();
		for(int i=0;i<num-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println("Enter the number to be searched ");
		int k = s.nextInt();
		boolean ans = compute(a,0,num-1,k);
		System.out.println((ans)? "Found" : "Not Found");
		s.close();
	}

}
