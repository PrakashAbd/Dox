package SeondAssign;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HMap 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int ch = 0;
		do
		{
			System.out.println("1.Insert 2.Display 3.Search 4.Exit");
			ch = s.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the Contact name and phone number");
						map.put(s.next(), s.nextInt());
						break;
				case 2: for(@SuppressWarnings("rawtypes") Map.Entry e: map.entrySet())
							System.out.println(e.getKey()+" "+e.getValue());
						break;
				case 3: System.out.println("Enter the name to be searched ");
						String str = s.next();
						System.out.println((map.containsKey(str))? "Found" : "Not Found");
						break;
				default: System.out.println("Exit");
			}
		}while(ch<4);
		s.close();
	}
}