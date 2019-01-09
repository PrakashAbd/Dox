package Frst;
import java.util.Scanner;
public class Scnd 
{
	public static void main(String args[])
	{
	        Scanner s = new Scanner(System.in);
	        String str = s.next();
	        boolean flag = true;
	        for(int i=0,j=str.length()-1;i<=j;i++,j--)
	        {
	            if(str.charAt(i)!=str.charAt(j))
	            {   
	            	System.out.println(str.charAt(i));
	                flag = true;
	                break;
	            }
	        }
	        if(flag)
	            System.out.println("YES");
	    
	        else
	            System.out.println("NO");
	        s.close();
	    }
	}
