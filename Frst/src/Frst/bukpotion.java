package Frst;
import java.util.Scanner;
public class bukpotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum = 0;
        if(str.length()==10)
        {
            for(int i=0;i<str.length();i++)
            {
                sum += ((int) str.charAt(i) )*(i+1);
            }
            if(sum%11==0)
                System.out.println("Legal ISBN");
            else
                System.out.println("Illegal ISBN");
        }
        else
            System.out.println("Illegal ISBN");
        s.close();
	}

}
