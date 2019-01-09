package com.example.boot;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.entity.Employee;
import com.example.entity.Login;

@RestController
public class Controller 
{

	@RequestMapping("/FirstPage")
	public ModelAndView func1()
	{
		return new ModelAndView("FirstPage");
	}
	
	
	@RequestMapping(value="/addUser")
	public ModelAndView fun2()
	{			return new ModelAndView("userpage");			}
	
	
	@RequestMapping("/userpage")
	public String func3(@RequestBody Login obj)
	{
		int num = Config.getLoginService().validate(obj);
		return ( (num > 0)? ( (num==1)? "Admin" : "User Login Successfully") : "Invalid UserId or Password");
	}
	
	
	@RequestMapping(value="/validate")
	public String func4(@RequestBody Employee u)
	{
		System.out.println(Config.getEmployeeService().addEmployee(u));
		Login login = Config.getLogin();
		login.setUsername(u.getUsername());
		login.setPassword(u.getPassword());
		
		System.out.println(Config.getLoginService().add(login));
		return "Inserted Successfully";
		//return new ModelAndView("redirect:/display");
	}
	
	
	@RequestMapping("/displayAll")
	public ResponseEntity<List<Employee>> func4()
	{
		List<Employee> list = Config.getEmployeeService().displayAll();
		return new ResponseEntity<List<Employee>> (list,HttpStatus.OK);
	}
	
	
	@RequestMapping("/display/{empId}")
	public  ResponseEntity<Employee> func5(@PathVariable String empId)
	{
		return new ResponseEntity<Employee>(Config.getEmployeeService().displayById(empId),HttpStatus.OK);
	}

	
	@RequestMapping("/deleteById/{empId}")
	public  String func6(@PathVariable String empId)
	{
		return Config.getEmployeeService().deleteEmployee(empId);
	}
}