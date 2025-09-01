package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//		Servlet Context
//		PrintWriter out = response.getWriter();
//		out.print("Hi ");
//		
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("phone");
//		out.print(str);
		
//		Servlet Config
		PrintWriter out = response.getWriter();
		out.print("hi ");
		
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		out.print(str);
	}
}
