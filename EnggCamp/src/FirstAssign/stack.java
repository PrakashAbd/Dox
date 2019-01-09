package FirstAssign;
import java.util.Scanner;
import java.util.Stack;
public class stack 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int n = 0;
		do
		{
			System.out.println("1.Push 2.Pop 3.Search 4.Exit");
			n = s.nextInt();
			switch(n)
			{
				case 1:	System.out.println("Enter the element to be pushed");
						st.push(s.nextInt());	 break;
				case 2: System.out.println("Element popped = "+st.pop());	break;
				case 3: System.out.println("Enter the element to be searched");
						System.out.println((st.contains(s.nextInt()))? "Element Found" : "Not Found");	break;
				default:System.out.println("Exit");
			}
		}while(n<4);
		s.close();
	}
}