package sample;
import java.util.InputMismatchException;
import java.util.Scanner;
public class excep 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = s.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured "+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException occured "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured "+e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException "+e);
		}
		s.close();
	}

}
