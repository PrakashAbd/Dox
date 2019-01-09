package FirstAssign;
import java.util.*;
public class Triplets 
{
	public static void printTriplets(int[ ] data) 
	{
		TreeSet<Integer> set = new TreeSet<Integer>();									//declaring a treeSet of type Integer
		for(int i: data)																			
			set.add(i);																	//storing array elements in a treeSet
		
		for(int i=0;i<data.length-1;i++)
			for(int j=i+1;j<data.length;j++)
				if(set.contains(data[i]+data[j]))										//checks whether the sum is present in set or not
					System.out.println(data[i]+" "+data[j]+" "+(data[i]+data[j]));
	}

	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int a[] = new int[s.nextInt()];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
			a[i] = s.nextInt();
		
		printTriplets(a);
		s.close();
	}
}