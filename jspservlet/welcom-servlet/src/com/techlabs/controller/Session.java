package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class Session
 */
@WebServlet("/Session")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession currentSession = request.getSession(true);
		PrintWriter out=response.getWriter();
		if(currentSession.isNew()) {
			currentSession.setAttribute("oldValue",0);
			currentSession.setAttribute("newValue",1);
		}
		else {
			currentSession.setAttribute("oldCount",(int)currentSession.getAttribute("oldValue")+1);
			currentSession.setAttribute("newCount",(int)currentSession.getAttribute("oldValue")+1);
		}
		out.println("Old: "+currentSession.getAttribute("oldValue"));
		out.println("New: "+currentSession.getAttribute("newValue"));
		out.println("Id: "+currentSession.getId());
	}

	
}
