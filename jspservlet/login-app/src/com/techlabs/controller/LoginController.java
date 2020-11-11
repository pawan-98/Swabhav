package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class auth
 */
@WebServlet("/auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Auth() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession currentSession = request.getSession();
		response.setContentType("text/html");
		String name = request.getParameter("userName");
		String passsword = request.getParameter("password");
		PrintWriter out = response.getWriter();
		System.out.println(name + passsword);
		if (name != null) {
			if (name.equals("admin") && passsword.equals("admin")) {
				currentSession.setAttribute("userName", name);
				currentSession.setAttribute("password", passsword);
				out.println("Welcome admin");
				out.print("<br><a href=/login-app/Logout>logout");

			}
		} else if (currentSession.getAttribute("userName") != null) {
			if (currentSession.getAttribute("userName").equals("admin")
					&& currentSession.getAttribute("password").equals("admin")) {
				out.println("Login from session");
				out.print("<br><a href=/login-app/Logout>logout");
			}
		}

		else {
			out.println("Failed");
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
