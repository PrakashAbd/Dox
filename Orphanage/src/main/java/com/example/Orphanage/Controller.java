package com.example.Orphanage;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.entity.Orphanage;
import com.example.entity.User;

@RestController
public class Controller 
{
	@RequestMapping("/FirstPage")
	public ModelAndView func1()
	{
		return new ModelAndView("FirstPage");
	}
	
	@RequestMapping("/SignUp")
	public ModelAndView func2()
	{
		return new ModelAndView("SignUp");
	}
	
	@RequestMapping("/validate")
	public String func3(@RequestBody User u)
	{
		
		if(u.getPhoneNumber()=="")
		{
			return Config.getUserService().addUser(u);
		}
		else
		{
			Orphanage o = Config.getOrphanage();
			o.setOrphanageName(u.getUsername());
			o.setPassword(u.getPassword());
			o.setOrphanageEmail(u.getEmail());
			o.setPhoneNumber(u.getPhoneNumber());
			o.setDistrict(u.getDistrict());
			return Config.getOrphanageService().add(o);
		}
	}
}