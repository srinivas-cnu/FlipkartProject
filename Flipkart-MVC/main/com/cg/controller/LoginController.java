package com.cg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.pojo.Login;

@Controller
public class LoginController {

	@Autowired
	UserDao userdao;

	@RequestMapping(value="/login",method=RequestMethod.GET )
	public ModelAndView showLogin(HttpServletRequest request,HttpServletResponse response)
		{
	       ModelAndView mav=new ModelAndView("Login");
	       return mav;
	}

//	@RequestMapping(value="/loginprocess",method=RequestMethod.POST)
//	public ModelAndView loginprocess(HttpServletRequest request,HttpServletResponse response,
//	@ModelAttribute("login")Login login) {
//		ModelAndView mav=null;
//		UserDao user=userService.validateUser(login);
//		if(null!=user)
//		{
//			mav=new ModelAndView("welcome");
//			mav.addObject("firstname",user.getFirstname());
//		}else
//		{
//			mav=new ModelAndView("login");
//			mav.addObject("message", "Username or Password is wrong!!");
//					}
//		return mav;
//	}
}



