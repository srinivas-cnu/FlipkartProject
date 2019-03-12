package com.cg.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView showMessage()
 {
		
 
		ModelAndView mv = new ModelAndView("HomePage");
//		mv.addObject("message", message);
//		mv.addObject("name", name);
		return mv;
	}
	
	
	@RequestMapping(value="/login" )
	public ModelAndView showLogin()
		{
	       ModelAndView mav=new ModelAndView("Login");
	       return mav;
	}
	
	@RequestMapping(value="/signup" )
	public ModelAndView showSignUp()
		{
	       ModelAndView mav=new ModelAndView("signup");
	       return mav;
	}
	
	@RequestMapping(value="/IphoneSpecifications" )
	public ModelAndView showiphonespecifications()
		{
	       ModelAndView mav=new ModelAndView("IphoneSpecifications");
	       return mav;
	}
	
	@RequestMapping(value="/HonorSpecifications" )
	public ModelAndView showHonorSpecifications()
		{
	       ModelAndView mav=new ModelAndView("HonorSpecifications");
	       return mav;
	}
	
	@RequestMapping(value="/OppoSpecifications" )
	public ModelAndView showOppoSpecifications()
		{
	       ModelAndView mav=new ModelAndView("OppoSpecifications");
	       return mav;
	}
	
	@RequestMapping(value="/RealmeSpecifications" )
	public ModelAndView showRealmeSpecifications()
		{
	       ModelAndView mav=new ModelAndView("RealmeSpecifications");
	       return mav;
	}
	
	@RequestMapping(value="/RedmiSpecifications" )
	public ModelAndView showRedmiSpecifications()
		{
	       ModelAndView mav=new ModelAndView("RedmiSpecifications");
	       return mav;
	}
	
	@RequestMapping(value="/SamsungSpecifications" )
	public ModelAndView showSamsungSpecifications()
		{
	       ModelAndView mav=new ModelAndView("SamsungSpecifications");
	       return mav;
	}
	

}