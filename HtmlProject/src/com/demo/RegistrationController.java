package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value1 = request.getParameter("fname");
		String value2 = request.getParameter("lname");
		String value3 = request.getParameter("gender1");
		String value4 = request.getParameter("gender2");
		String value5 = request.getParameter("password");
		PrintWriter output = response.getWriter();
		output.print("Welcome : " + value1 + value2);
		output.print("You're Registered Successfully!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
