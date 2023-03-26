package com.learn.jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name="Raja";
		
		List<Student> students = Arrays.asList(new Student("Raja",1),new Student("Praveen",2),new Student("Naveen",3));
		
		req.setAttribute("students", students);
		
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
}
