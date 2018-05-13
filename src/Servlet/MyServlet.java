package Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		out.print("<p>������·����"+request.getServletPath()+"</p>");
		out.print("<p>HTTP�������ͣ�"+request.getMethod()+"</p>");
		out.print("<p>���������"+request.getQueryString()+"</p>");
		out.print("<p>����URI��"+request.getRequestURI()+"</p>");
		out.print("<p>����URL��"+request.getRequestURL()+"</p>");
		out.print("<p>����Servlet·����"+request.getServletPath()+"</p>");
	}
}
