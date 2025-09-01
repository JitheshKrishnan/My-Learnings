package com.example;

import java.util.List;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemojstlServlet")
public class DemojstlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> studs = Arrays.asList(new Student(1, "JK"), new Student(2, "NK"), new Student(3, "MA"));
		
		request.setAttribute("students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("displayJstl.jsp");
		rd.forward(request, response);
	}
}
