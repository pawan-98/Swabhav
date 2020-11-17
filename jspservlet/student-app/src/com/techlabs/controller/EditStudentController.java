package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.StudentService;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentService studentService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditStudentController() {
		super();
		// TODO Auto-generated constructor stub
		studentService = StudentService.getInstance();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("student", studentService.getStudentUsingId(request.getParameter("edit")));
		HttpSession currentSession = request.getSession();
		

			RequestDispatcher dispatcher = request.getRequestDispatcher("UpdateStudent.jsp");
			dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		studentService.updateStudent(request.getParameter("edit"), request.getParameter("name"),
				request.getParameter("gender"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/StudentController");
		dispatcher.forward(request, response);
	}

}
