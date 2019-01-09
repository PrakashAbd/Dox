package Frst2weeks;
public class Person
{
	String name;
	public Person()		{	name = null;		}
	
	public Person(String name) 
	{	this.name = name;		}
	
	public String getName() 
	{		return name;		}
	
	public void setName(String name) 
	{		this.name = name;	}
	
	boolean isOutstanding()
	{
		return true;
	}
}