package sample;

abstract class Teacher
{
	static String designation = "HOD";
	static String college = "KIT";
	abstract void print();
}
class Maths extends Teacher
{
	private String topic = "Algebra";
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}

	void print()
	{	
		System.out.println("Derived class");	
	}
}

class Science extends Teacher
{
	private String topic = "Biology";
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}

	void print()
	{	
		System.out.println("Derived class");	
	}
}


public class Inherit 
{
	public static void main(String args[])
	{
		
	}
}
