package Frst;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=2;i<=num;i++)
        {
            boolean flag = true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    flag = false;
            }
            if(flag)
                System.out.print(i +" ");
        }
        s.close();
	}

}
