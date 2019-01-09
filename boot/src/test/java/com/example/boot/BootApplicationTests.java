package com.example.boot;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.daoimpl.EmployeeDaoImpl;
import com.example.entity.Employee;
import com.example.serviceimpl.EmployeeServiceImpl;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests extends TestCase
{
	@Mock
	EmployeeDaoImpl edl;
	
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@InjectMocks
	EmployeeServiceImpl esl;
	
	List<Employee> list1= new ArrayList<>();
	
	@Before
	public void initializeMockito()
	{
		MockitoAnnotations.initMocks(this);
		Employee employee;
		employee = new Employee("M1049216","vickyy","vickyyy123","vignesh","vicky@123","10/06/1997","male","fathers name?","Balaji"); 
		list1.add(employee);
		employee = new Employee("M1049213","karthick","karthi123","karthikeyan","karthick@123","10/06/1997","male","fathers name?","Suresh");
		list1.add(employee);
		employee = new Employee("M1049214","karthick","karthi123","karthikeyan","karthick@123","10/06/1997","male","fathers name?","Suresh");
		list1.add(employee);
		
	}

	@Ignore
	@Test
	public void testAddEmployee()
	{	
		org.mockito.Mockito.when(edl.addEmployee(list1.get(0))).thenReturn("Inserted Successfully");
		assertEquals(esl.addEmployee(list1.get(0)), "Inserted Successfully");
	}
	
	@Test
	public void testEmployeeById()
	{
		org.mockito.Mockito.when(edl.displayById("M1049216")).thenReturn(list1.get(1));
		assertEquals("karthick",edl.displayById("M1049216").getUsername());
		
	}
	@Test
	public void testDisplayAll() 
	{
		
		org.mockito.Mockito.when(edl.displayAll()).thenReturn(list1);
		assertEquals(3, esl.displayAll().size());
		/*for(int i=0;i<list1.size();i++)
			assertEquals(list1.get(i).getEmailId(),esl.displayAll().get(i).getEmailId());*/
	}
}