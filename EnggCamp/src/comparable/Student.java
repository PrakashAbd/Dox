package comparable;
import java.util.Comparator;
public class Student 
{
	String name,loc;
	int id;
	double percentage;
	public Student(int id, String name, String loc, double percentage) {
		super();
		this.name = name;
		this.loc = loc;
		this.id = id;
		this.percentage = percentage;
	}
}
class ID_Compare implements Comparator<Student>
{
	public int compare(Student s1,Student s2) 
	{	return (s1.id>s2.id)? 1 : -1;			}
}
class Name_Compare implements Comparator<Student>
{
	public int compare(Student s1,Student s2) 
	{	return s1.name.compareTo(s2.name);			}
}