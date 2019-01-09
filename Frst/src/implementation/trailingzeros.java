package implementation;
import java.util.Scanner;
import java.util.ArrayList;
public class trailingzeros 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- >0)
		{
			int zero = s.nextInt();
			boolean flag = true;
			int num = 5;
			ArrayList<Integer> l = new ArrayList<Integer>();
		
			while(flag)
			{
				long sum = 1,rem = 0,count1 = -1;
				for(int i=2;i<=num;i++)
					sum *= i;
		
				while(rem==0)
				{
					rem = sum%10;
					sum /= 10;
					count1++;
				}
				
				if(count1==zero)
					l.add(num);
				else if(count1>zero)
					break;
				
				num += 1;
			}
			System.out.println(l.size());
			for(int i : l)
				System.out.print(i+" ");
		}
		s.close();
	}
}