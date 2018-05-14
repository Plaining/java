package Example.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		if(name!=null&&name.isEmpty()) {
			out.print("你好"+name);
			out.print(",<br>欢迎来到我的主页");
		}else {
			out.print("请输入您的中文名字");
		}
		out.print("<br><a href=index.jsp>返回</a>");
		out.flush();
		out.close();
	}
}
