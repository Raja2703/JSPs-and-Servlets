package com.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		int sum=0;
		//using cookies
		Cookie cookies[]=req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("sum")) {
				sum=Integer.parseInt(c.getValue());
			}
		}
		//using session storage
		
//		HttpSession session=req.getSession();
//		int sum = (int) session.getAttribute("sum");
		sum=sum*sum;
		
		out.println("sq of two nos is: "+sum);
	}

}
