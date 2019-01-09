package FirstAssign;
import java.util.Scanner;
import java.util.LinkedList;
public class LList 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> st = new LinkedList<Integer>();
		int n = 0;
		try {
		do
		{
			System.out.println("1.Add 2.Remove 3.Replace 4.Display 5.Exit");
			n = s.nextInt();
			switch(n)
			{
				case 1:	System.out.println("Enter the element to be added");
						int ele = s.nextInt();
						System.out.println("1.At front 2.At last 3.At specified index");
						int choice = s.nextInt();
						if(choice==1)
							st.addFirst(ele);
						else if(choice==2)	
							st.addLast(ele);
						else
						{
							System.out.println("Enter the index"); 				
							st.add(s.nextInt(), ele);
						}
						break;
				
				case 2: System.out.println("1.At front 2.At last 3.Specified Element");
						int ch = s.nextInt();
						if(ch==1)
							st.removeFirst();
						else if(ch==2)	
							st.removeLast();
						else
						{	System.out.println("Enter the index");
							st.remove(s.nextInt());
						}
						break;
							
				case 3: System.out.println("Enter the index and the element to be replaced");
						st.set(s.nextInt(), s.nextInt());	break;
				
				case 4: st.stream().forEach(e -> System.out.println(e));        break;
				
				default:System.out.println("Exit");
			}
		}while(n<5);
		}
		catch(Exception e) 	{	System.out.println("Enter Corerct Input values "+e);		}
		s.close();
	}
}