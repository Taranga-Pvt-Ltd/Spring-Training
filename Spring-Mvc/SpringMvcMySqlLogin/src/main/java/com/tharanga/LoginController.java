package com.tharanga;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tharanga.service.LoginService;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView checkUser(HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mv = new ModelAndView();
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		/*
		if(uname.equals("ramya") && pass.equals("123"))
		{
			mv.setViewName("success.jsp");
		}
		else
		{
			mv.setViewName("index.jsp");
		}*/
		
		
		if(new LoginService().check(uname, pass))
		{
			mv.setViewName("success.jsp");
		}
		else
		{
			mv.setViewName("index.jsp");
		}
		return mv;
	}

}
