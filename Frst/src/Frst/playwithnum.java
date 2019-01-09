package Frst;
import java.util.Scanner;
public class playwithnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int q = s.nextInt();
        int a[] = new int[num];
        for(int i=0;i<num;i++)
            a[i] = s.nextInt();
        
        while(q-- >0)
        {
            long sum = 0,count = 1;
            int l = s.nextInt();
            int r = s.nextInt();
            int j = l-1;
            while(j<r && r<num)
            {
                sum += a[j];
                count++;
                j++;
            }
            System.out.println(sum/count);
        }
        s.close();
	}

}
