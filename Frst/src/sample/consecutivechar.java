package sample;
import java.util.Scanner;
public class consecutivechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int res[] = new int[25];
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)+1 == str.charAt(i+1))
				res[str.charAt(i)-97]++;
		}
		for(int i=0;i<25;i++)
		{
			if(res[i]>0)
				System.out.println((char)(i+97) + " "+(char)(i+98)+" = "+ res[i]);
		}
		s.close();
	}
}