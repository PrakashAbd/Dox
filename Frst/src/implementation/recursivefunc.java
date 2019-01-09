package implementation;
import java.util.Scanner;
public class recursivefunc 
{
	public static int func(int x,int y)
    {
        if(x==0)
            return (y+1)%1000; 
        else if(y==0)
            return  (func(x-1,1)%1000);
        else
            return (func(x-1,func(x,y-1)));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println( func(x,y) );
        s.close();
	}
}
