package implementation;
import java.util.Scanner;
public class hackerswithbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(s.nextInt()==0)
                count++;
        }
        System.out.println(n-count);
        s.close();
	}

}
