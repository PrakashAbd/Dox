package comparable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("Enter number of students");
		int num = s.nextInt();
		System.out.println("Enter the Student ID, Name, Location, Percentage");
		for(int i=0;i<num;i++)
			list.add(new Student(s.nextInt(),s.next(),s.next(),s.nextDouble()));
		
		System.out.println("Sort Using ID");
		Collections.sort(list,new ID_Compare());
		for(Student s1: list)
			System.out.println(s1.id+" "+s1.name+" "+s1.loc+" "+s1.percentage);
		
		System.out.println("Sort Using Name");
		Collections.sort(list,new Name_Compare());
		for(Student s1: list)
			System.out.println(s1.id+" "+s1.name+" "+s1.loc+" "+s1.percentage);
		s.close();
	}
}