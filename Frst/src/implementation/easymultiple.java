package implementation;
import java.util.Scanner;
public class easymultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- >0)
        {
            long sum = 0;
            long num = s.nextInt();
            for(long i=3;i<num;i+=3)
                    sum += i;
                    
            for(long i=5;i<num;i+=5)
                if(i%5==0 && i%3!=0)
                    sum += i;
            System.out.println(sum);
        }
        s.close();
	}

}
