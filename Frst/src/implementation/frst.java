package implementation;
import java.util.Scanner;
public class frst {

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
            int c = s.nextInt();
            switch(c)
            {
                case 1: int x = s.nextInt();
                        int y = s.nextInt();
                        a[x] = y;
                        break;
                case 2: int d = s.nextInt();
                        int e = s.nextInt();
                        int sum = 0;
                        for(int i=d;i<=e;i++)
                            sum += a[i];
                        System.out.println(sum);
                        break;
            }
        }
        s.close();
	}

}
