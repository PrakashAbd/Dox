package FirstAssign;
import java.util.*;
public class ConsecutiveCharacters 
{
	public static void printConsecutiveCharacters(String str) 
	{
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		for(int i=0;i<str.length()-1;i++)
		{
			int j = (str.charAt(i+1)==45)? i+2: i+1;
			char c1 = Character.toUpperCase(str.charAt(i));
			char c2 = Character.toUpperCase(str.charAt(j));
			
			if( (c1+1) == c2)
			{
				String temp = ""+c1+c2;
				map.put(temp, (map.containsKey(temp)) ? (map.get(temp)+1): 1);
			}
		}
		
		for(Map.Entry<String,Integer> m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		printConsecutiveCharacters(s.nextLine());
		s.close();
	}
}