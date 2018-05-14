package Example.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	protected String encoding = null;//×Ö·û±àÂë
	protected FilterConfig filterConfig = null;//filterConfig¶ÔÏó
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		this.encoding=null;
		this.filterConfig=null;
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(encoding!=null) {
			arg0.setCharacterEncoding(encoding);
			arg1.setContentType("text/html;charset="+encoding);
		}
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
		this.encoding = filterConfig.getInitParameter(encoding);
	}

}
