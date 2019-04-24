package com.tharanga.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1")int i, @RequestParam("t2") int j, HttpServletRequest req, HttpServletResponse res)
	{
	//	int i = Integer.parseInt(req.getParameter("t1"));
	//	int j = Integer.parseInt(req.getParameter("t2"));
	//	int k = i+j;
		
		AddService as = new AddService();
		int k = as.add(i, j);
		
		ModelAndView mv = new ModelAndView(); //it will pass the object
	//	mv.setViewName("Display.jsp");
		mv.setViewName("Display");
		mv.addObject("result",k);
		
		return mv;
	}

}
