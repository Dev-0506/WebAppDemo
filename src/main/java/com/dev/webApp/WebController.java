package com.dev.webApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	@RequestMapping("/courses")
	public String display(HttpServletRequest req)
	{
		HttpSession session=req.getSession();
		String cname=req.getParameter("name");
		session.setAttribute("course", cname);
		
		System.out.println("My favourite course is "+cname );
		return "Index.jsp";
	}
	
	@GetMapping("/techno")
	public ModelAndView show(String tech)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("technology", tech);
		mv.setViewName("Index.jsp");
		return mv;
		//here we are doing the same thing which we had done above but without httpservlet and httpsession object
	}
	
	
	
	
	
}
