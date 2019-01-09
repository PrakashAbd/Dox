package Frst;
import java.util.Scanner;
public class profylpic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int n = s.nextInt();
        for(int i= 0;i<n;i++)
        {
            int w = s.nextInt();
            int h = s.nextInt();
            if(w<l || h<l)
                System.out.println("UPLOAD ANOTHER");
            else if(w>=l && h>=l)
            {
                if(h==w)
                    System.out.println("ACCEPTED");
                else
                    System.out.println("CROP IT");
        
            }
        }
        s.close();
	}

}
