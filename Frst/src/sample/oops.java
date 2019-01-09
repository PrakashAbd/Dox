package sample;

class Teacher1
{
	static String designation = "HOD";
	static String college = "KIT";
	void print()
	{	System.out.println("Base class");}
}
class Maths1 extends Teacher1
{
	static String topic = "Algebra";
	void print()
	{	
		super.print();
		System.out.println("Derived class");	
	}
}
public class oops 
{
    public static void main(String args[] ) throws Exception 
    {
        new Maths().print();
        System.out.println(Teacher1.designation+" "+Teacher1.college+" "+Maths1.topic);     
   }
}