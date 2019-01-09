package com.mindtree.jdbctemplate;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mindtree.daoimpl.StudentDaoImpl;
import com.mindtree.entity.Student;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
    	Scanner s = new Scanner(System.in);
    	StudentDaoImpl obj = (StudentDaoImpl)ac.getBean("d");
    	int ch = 0;
    	do
    	{
    		Student st;
    		System.out.println("1.Add 2.Delete 3.Update 4.Display By RollNum 5.Display 6.Exit");
    		ch = s.nextInt();
    		switch(ch)
    		{
    			case 1: System.out.println("Enter the Student RollNumber");
    					st= new Student();
    					st.setRollNum(s.nextInt());
    					System.out.println("Enter the Student Name");
    					st.setName(s.next());
    					System.out.println("Enter the Student percentage");
    					st.setPercentage(s.nextDouble());
    					System.out.println(obj.addStudent(st));
    					break;
    			case 2: System.out.println("Enter the Student Roll Number to be deleted");
    					System.out.println(obj.deleteStudent(s.nextInt()));
    					break;
    			case 3: System.out.println("Enter the Student RollNum");
    					st= new Student();
    					st.setRollNum(s.nextInt());
    					System.out.println("Enter the Student Name");
    					st.setName(s.next());
    					System.out.println("Enter the Student percentage");
    					st.setPercentage(s.nextDouble());
    					System.out.println(obj.addStudent(st));
    					break;
    			case 4: System.out.println("Enter the Student RollNumber you want to dispay");
    					System.out.println(obj.displayById(s.nextInt()));
    					break;
    			case 5: System.out.println(obj.displayAll());
    					break;
    			default: System.out.println("Exit");
    		}
    	}while(ch<6);
    	s.close();
    }
}