package Frst2weeks;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assign
{
	public static void main(String[] args) throws FileNotFoundException,IOException 
	{
		Scanner s =new Scanner(System.in);
		try (BufferedReader r = new BufferedReader(new FileReader("d:/myfie.txt")))
		{
		List<Products> list = new ArrayList<Products>();
		List<Products> result = new ArrayList<Products>();
		String str;
		while((str=r.readLine())!=null)
		{
			String array[] = str.split(",");
			Products p = new Products(Integer.valueOf(array[0]),Double.valueOf(array[2]),array[1],array[3]);	//passing the values to the constructor
			list.add(p);
		}
		r.close();
		System.out.println("Enter any one of the strings Beverages, Condiments and Poultry");												
		String ans = s.next();																	//getting the string from the user
		
		list.stream().filter(e -> e.category.equals(ans)).forEach(i -> result.add(i));			//lambda expression to filter the category
		result.sort((Products p1,Products p2) -> p1.name.compareTo(p2.name));					//sorted using lambda expression
		
		for(Products p1: result)
			System.out.println(p1.id+" "+p1.category+" "+p1.name+" "+p1.price);
		
		}
		catch(Exception e)		{	System.out.println("File Not Found "+e);	}
		s.close();
	}
}