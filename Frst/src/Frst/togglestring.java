
package Frst;
import java.util.Scanner;
public class togglestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]>=97)
                ch[i] -= 32;
            else
                ch[i] += 32;
        }
        System.out.println(ch);
        s.close();
	}

}
