package implementation;
import java.util.Scanner;
public class busjourney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int stops = s.nextInt();
		int seats= s.nextInt();
		int avail = seats;
		int count = 0;
		while(stops-- >1)
		{
			int in = s.nextInt();
			int out = s.nextInt();
			avail = (avail==seats)? seats: (avail+out);
			avail -= in;
			count = (avail==0)? count+1 : count;
			//System.out.println(avail);
		}
		System.out.println(count);
		s.close();
	}

}
