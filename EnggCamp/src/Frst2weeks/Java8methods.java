package Frst2weeks;
interface i
{
	default void func() {	System.out.println("I");	}
}
interface i1
{
	default void func()	{	System.out.println("I1");	}
}
public class Java8methods implements i,i1 
{	
	public static void display1()
	{		System.out.println("Display static method");		}
	
	public void display()
	{		System.out.println("Display method");		}
	
	public void func()
	{	
		i.super.func();
		i1.super.func();
	}
	public static void main(String[] args) 
	{
		Java8methods j1 = new Java8methods();
//		i obj = j1::display;						//method reference to an instance method of an object
//		obj.func();
//		obj = Java8methods::display1;				//Calling a static method
		j1.func();
	}
}