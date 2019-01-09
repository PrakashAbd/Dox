package Frst;
import java.util.Scanner;
public class liveworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        while(true)
        {
            int n = s.nextInt();
            if(n!=42)
                System.out.println(n);
            else
                break;
        }
        s.close();
	}
}
