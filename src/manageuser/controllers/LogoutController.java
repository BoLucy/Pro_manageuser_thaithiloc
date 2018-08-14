/**
 * Copyright(C) 2018 Luvina
 *LogoutController.java, Aug 14, 2018 LA-AM
 */
package manageuser.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author LA-AM
 *
 */
//@WebServlet("/logout")
public class LogoutController extends HttpServlet{
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  req.getSession().invalidate();
	      resp.sendRedirect(req.getContextPath() + "/jsp/ADM001.jsp");
	}
}
