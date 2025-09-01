package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
				
//		Request Dispatcher
//		int k = (int)req.getAttribute("k");
//		k = k * k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("The result is " + k);
		
//		Send Redirect
//		int k = Integer.parseInt(req.getParameter("k"));
//		k=k*k;
//		PrintWriter out = res.getWriter();
//		out.println("The result is " + k);
		
//		Session
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
//		k=k*k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("The result is " + k);
		
//		Cookies
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		k=k*k;
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor = 'cyan'>");
		out.println("The result is " + k);
		out.println("</body></html>");
	}
}