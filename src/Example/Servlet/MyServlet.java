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
			out.print("���"+name);
			out.print(",<br>��ӭ�����ҵ���ҳ");
		}else {
			out.print("������������������");
		}
		out.print("<br><a href=index.jsp>����</a>");
		out.flush();
		out.close();
	}
}
