package Frst2weeks;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample 
{
	static Map<String,Employee> hmap = new TreeMap<String,Employee>();
	
	public static void main(String args[])
	{
		try	{
		Employee e = new Employee();
		e.setMid("M1049256");
		e.setName("Anoop");
		e.setSalary(10000);
		hmap.put(e.getMid(),e);
		
		e= new Employee();
		e.setMid(null);
		e.setName("Arun");
		e.setSalary(15000);
		hmap.put(e.getMid(),e);
		
		e = new Employee();
		e.setMid("M1049257");
		e.setName("Bala");
		e.setSalary(20000);
		hmap.put(e.getMid(),e);
		System.out.println(hmap.keySet());
		
		
		for(Entry<String,Employee> e1 : hmap.entrySet())
			System.out.println(e1.getKey()+" "+e1.getValue());
		
		for(Employee e1: hmap.values())										
			System.out.println(e1.getMid()+" "+e1.getName()+" "+e1.getSalary());
		}
		catch(NullPointerException e)
		{	System.out.println("Exception Occurred : "+ e);		}
		
	}
}
