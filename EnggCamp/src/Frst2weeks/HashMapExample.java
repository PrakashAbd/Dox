package Frst2weeks;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.TreeMap;

public class HashMapExample 
{
	static Map<String,Employee> hmap = new HashMap<String,Employee>();
	
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.setMid("M1049256");
		e.setName("Anoop");
		e.setSalary(10000);
		hmap.put(e.getMid(),e);
		
		e= new Employee();
		e.setMid("M1049258");
		e.setName("Arun");
		e.setSalary(15000);
		hmap.put(e.getMid(),e);
		
		e = new Employee();
		e.setMid("M1049257");
		e.setName("Bala");
		e.setSalary(20000);
		hmap.put(e.getMid(),e);
		
		System.out.println(hmap.keySet());
		
		
		for(Entry<String,Employee> e1 : hmap.entrySet())								//Using EntrySet
			System.out.println(e1.getKey()+" "+e1.getValue());
		
		for(Employee e1: hmap.values())													//Using Values set			
			System.out.println(e1.getMid()+" "+e1.getName()+" "+e1.getSalary());
		
		System.out.println("Using Lambda Expression");
		hmap.forEach((mid,employee) -> System.out.println(mid+" "+employee));			//Using lambda Expression
		
		System.out.println("Using EntrySet in lambda Expression");
		hmap.entrySet().forEach(System.out::println);					
	
	}
}
