package com.cg.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.controller.UserDao;

public class RegistrationController {


@WebServlet(description = "to insert data", urlPatterns = { "/RegistrationServlet" })
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegistrationServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		   String Username=request.getParameter("Username");
		   String password=request.getParameter("password"); 
		   
           boolean status=false;
		 UserDao u=new UserDao();
		
		
		 try {
			 status= u.register(Username, password);
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		 if(status==true)
		 {
			 response.sendRedirect("HomePage.jsp");
		 }
		 else
		 {
			 response.sendRedirect("signup.jsp");
		 }
	}
}
}


