package Frst2weeks;
public class Student extends Person
{
	double percentage;

	public Student() 	{	percentage = 0.0;		}

	public Student(String name,double percentage) 
	{
		super(name);
		this.percentage = percentage;
	}
	void display()
	{
		System.out.println("Name : "+this.name+"\tPercentage : "+this.percentage);
	}
	boolean isOutstanding()
	{
		return (this.percentage>85)? true : false;
	}
}