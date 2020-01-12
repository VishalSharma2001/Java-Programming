package com.Percent;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddPercent extends HttpServlet{
	  public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		  int i=Integer.parseInt(req.getParameter("first"));
		  int j=Integer.parseInt(req.getParameter("second"));
		  double k=i/j*100;
		  PrintWriter out=res.getWriter();
		  out.println("Percentage is="+k);
		  
	  }

}
