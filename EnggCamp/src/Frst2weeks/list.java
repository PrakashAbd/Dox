package Frst2weeks;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class list 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("Sachin");
		list.add("Kholi");
		list.add("Abde");
		list.add("Dravid");
		list.add("Gayle");
		list.add("Pandya");
		
		System.out.println("Sub-list"+list.getFirst()+" "+list.getLast());
		System.out.println(list.peek()+" "+list.pollFirst()+" "+list.peekFirst());
		
		String[] ar = list.toArray(new String[list.size()]);
		System.out.println(Arrays.asList(ar));
		
		ArrayList<String> list2 = new ArrayList<String>(list.subList(3, 5));
		list2.stream().forEach(e -> System.out.print(e+" "));
		
		System.out.println("\nReversing the list");
		Collections.reverse(list);
		for(String str: list)
			System.out.print(str+" ");
		
		Collections.sort(list);
		System.out.println("\nSorted list");
		for(String str: list)
			System.out.print(str+" ");
		
		System.out.println("\nDescending order");
		Collections.sort(list,Collections.reverseOrder());
		list.stream().forEach(e -> System.out.print(e+" "));
	
		System.out.println("\nSwapping two elements");
		Collections.swap(list, 1, 2);
		list.stream().forEach(e -> System.out.print(e+" "));
	
	
	}
}