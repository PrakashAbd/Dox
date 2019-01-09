package implementation;
import java.util.Scanner;
public class stringsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum = 0;
        for(int i=0;i<str.length();i++)
            sum += str.charAt(i)-96;
        System.out.println(sum);
        s.close();
	}
}