package com.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends jakarta.servlet.http.HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int n1=Integer.parseInt(req.getParameter("num1"));
		int n2=Integer.parseInt(req.getParameter("num2"));
		int sum = n1+n2;
		
		//using session storage
//		HttpSession session=req.getSession();
//		session.setAttribute("sum", sum);
		
		//using cookie
		Cookie cookie=new Cookie("sum",sum+"");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
//		req.setAttribute("sumValue", sum);
//		
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	}
}
