/**
 * Copyright(C) 2018 Luvina
 *LoginController.java, Aug 13, 2018 LA-AM
 */
package manageuser.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manageuser.validates.ValidateUser;

/**
 * @author LA-AM
 *
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
//		req.getRequestDispatcher("ADM001.jsp").include(req, resp);  
		String login_name = req.getParameter("loginId");
		String password = req.getParameter("password");
		try {
			ArrayList<String> listError = ValidateUser.validateLogin(login_name, password);
			if(listError.size() == 0) {
				System.out.println("Login success");
				RequestDispatcher rd = req.getRequestDispatcher("/jsp/ADM002.jsp");
				rd.forward(req, resp);	
				HttpSession session = req.getSession(true); // reuse existing
				// session if exist
				// or create one
				session.setAttribute("user", login_name);
				session.setMaxInactiveInterval(3000); // 5 mins
				resp.sendRedirect("jsp/ADM001.jsp");
			} else {
				for (String string : listError) {
					System.out.println(string);
				}
				req.setAttribute("listError", listError);
				req.setAttribute("login",login_name);
				RequestDispatcher rd = req.getRequestDispatcher("/jsp/ADM001.jsp");
				rd.forward(req, resp);
				System.out.println("Login fail");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
