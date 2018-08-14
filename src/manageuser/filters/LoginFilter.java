/**
 * Copyright(C) 2018 Luvina
 *LoginFilter.java, Aug 14, 2018 LA-AM
 */
package manageuser.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author LA-AM
 *
 */
public class LoginFilter implements Filter{

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) req;//ép kiểu 
	        HttpServletResponse response = (HttpServletResponse) resp;
	        HttpSession session = request.getSession(false);//nếu chưa có ss thì tự tạo
	        String loginURI = request.getContextPath() + "/jsp/ADM001.jsp";//đường dẫn đến trang login
	        boolean loggedIn = session != null && session.getAttribute("user") != null;
	        boolean loginRequest = request.getRequestURI().equals(loginURI);
	        if (loggedIn || loginRequest) {
	            chain.doFilter(request, response);
	        } else {
	        	System.out.println(loginURI);
	            response.sendRedirect(loginURI);
	        }
	    }
		
	

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
	
}
