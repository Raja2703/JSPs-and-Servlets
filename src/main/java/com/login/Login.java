package com.login;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		if(uname.equals("Raja") && pass.equals("27")) {
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("pass", pass);
			res.sendRedirect("welcome.jsp");
		}
	}
}
