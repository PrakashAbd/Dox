package Frst2weeks;
import java.util.Set;
//import java.util.HashSet;
import java.util.TreeSet;
public class set 
{
	public static void main(String[] args) 
	{
		Set<String> s = new TreeSet<String>();
		s.add("E");
		s.add("A");
		s.add("a");
		s.add("Z");
		s.add("B");
		s.stream().forEach(e -> System.out.println(e));
	}
}