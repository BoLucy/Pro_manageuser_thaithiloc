/**
 * Copyright(C) 2018 Luvina
 *LoginController.java, Aug 13, 2018 LA-AM
 */
package manageuser.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manageuser.validates.ValidateUser;

/**
 * @author LA-AM
 *
 */

public class LoginController extends HttpServlet {
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login_name = req.getParameter("loginId");
		String password = req.getParameter("password");
		try {
			ArrayList<String> listError = ValidateUser.validateLogin(login_name, password);
			if(listError.size() == 0) {
				RequestDispatcher rd = req.getRequestDispatcher("/JSP/ADM002.jsp");
				rd.forward(req, resp);	
				Cookie ck = new Cookie("login_name", login_name);
				resp.addCookie(ck);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("/JSP/ADM001.jsp");
				rd.forward(req, resp);	
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
