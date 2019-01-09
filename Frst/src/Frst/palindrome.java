package Frst;
import java.util.Scanner;
public class palindrome {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
        String str = s.next();
        boolean flag = true;
        for(int i=0,j=str.length()-1;i<=j;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {   
                flag = false;
                break;
            }
        }
        System.out.println((flag)? "YES" : "NO");
        s.close();
	}
}
