package Frst2weeks;
import java.util.*;
public class map 
{
	public static void main(String[] args) 
	{
		String s = "welcome to mindtree welcome to possible";
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
				map.put(ch,map.get(ch)+1);
			else
				map.put(ch,1);
		}
		for(Map.Entry<Character,Integer> e : map.entrySet())
			System.out.println(e.getKey()+" "+ e.getValue());
	}
}