package com.example.mobileshop.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.mobileshop.entity.Shop;
import com.example.mobileshop.service.ServiceImpl;


@Controller
public class HomeController 
{
	ServiceImpl service = new ServiceImpl();
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/Adduser")
	public ModelAndView test1(HttpServletResponse response) throws IOException{
		return new ModelAndView("Adduser");
	}

	@RequestMapping(value="/validate")
	public String test2(@RequestBody Shop shop) throws IOException
	{
		
		try {
			System.out.println(shop.getName());
			service.add(shop);
			return "Success";
			//return new ModelAndView("redirect:/displayAll");		
		} catch (Exception e) {
			//return new ModelAndView("errorpage");
			return "Failure";
		}
	}
	
	@RequestMapping("/GetId")
	public ModelAndView func2()
	{
		return new ModelAndView("displayById");
	}
	
	@RequestMapping("/ById")
	public ModelAndView func3(@ModelAttribute("a") String id)
	{
		try {
			return new ModelAndView("display","list1",service.displayById(id));
		} catch (Exception e) {	
			return new ModelAndView("errorpage");
		}
	}
	
	@RequestMapping("/displayAll")
	public ModelAndView func4()
	{
		List<Shop> list;
		try {
			list = service.display();
			return new ModelAndView("display","list1",list);
		} catch (Exception e) {
			return new ModelAndView("errorpage");
		}
	}
}
