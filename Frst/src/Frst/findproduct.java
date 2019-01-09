package Frst;
import java.util.Scanner;
public class findproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++)
            a[i] = s.nextInt();
        
        long ans = 1;
        for(int i=0;i<size;i++)
            ans = (long) ((ans*a[i])%(Math.pow(10,9)+7));
        System.out.println(ans);
        s.close();
	}

}
