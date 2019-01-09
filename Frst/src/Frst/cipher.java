package Frst;
import java.util.Scanner;
public class cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String str = s.next();
        int i = 0, count = 0;
        for(i=0;i<str.length()-1;i++)
        {   
            if( (i==1 && str.charAt(i+1)>=65) || (i==2 && str.charAt(i)>=65))
                continue;
            
            int a = str.charAt(i)-48;
            int b = str.charAt(i+1)-48;
            if((a+b)%2==0)
            {
            	count++;
            	continue;
            }
            else
                break;
        }
        System.out.println((count==4)? "valid" : "invalid");
        s.close();
	}

}
