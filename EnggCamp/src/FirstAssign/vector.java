package FirstAssign;

import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;
public class vector 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Vector<String> list = new Vector<String>();
		System.out.println("Enter the Strings");
		list.add(s.next());
		list.add(s.next());
		list.add(s.next());
		list.add(s.next());
		
		list.stream().forEach(e -> System.out.println(e));		//Using lambda expression to print the list
		
		list.remove(2);											//remove the third element in the list
		
		System.out.println("After removing 3rd element");
		for(String str: list)									//print the elements using for-each loop
			System.out.println(str);
		
		System.out.println("Size = "+list.size());				//print the size of the list
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())									//traverse the list using iterator
			System.out.println(itr.next());
			
		s.close();
	}
}