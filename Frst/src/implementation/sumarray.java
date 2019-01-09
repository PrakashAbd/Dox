package implementation;
import java.util.Scanner;
public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        long sum = 0;
        for(int i=0;i<num;i++)
            sum += s.nextInt();
        System.out.println(sum);
        s.close();
	}

}
