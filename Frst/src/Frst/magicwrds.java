package Frst;
import java.util.Scanner;
public class magicwrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		while(q-- > 0)
		{
			System.out.println();
			int len = s.nextInt();
			String s1 = s.next();
			for(int i=0;i<len;i++)
			{
				int a = s1.charAt(i);
				int b = (a!=65)? a : 0;
				int res = a;
				int ans = 0;
				while(a>65)
				{
					boolean flag = true;
					for(int j=2;j<=b/2;j++)
					{
						if(b%j==0)
						{	flag = false;break;	}
					}
					if(flag)
						break;
					else
						b--;
				}
				while(true)
				{
					boolean flag = true;
					for(int j=2;j<=a/2;j++)
					{
						if(a%j==0)
						{	flag = false;break;	}
					}
					if(flag)
						break;
					else
						a++;
				}
				if((res-b)==(a-res))
					ans = b;
				else if((res-b)>(a-res))
					ans = a;
				else
					ans = b;
					
					
				System.out.print((char) ans);
			}
		}
		s.close();
	}

}
