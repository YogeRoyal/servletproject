package com.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResetPassword
 */
@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");

		if(password.equals(confirmpassword)) {
		   boolean status= UserDAO.resetPassword(email,password);
		   if(status) {
				request.getRequestDispatcher("resetpassword.html").include(request, response);
				   writer.println("<html><body><p style='color:red'><center>your password reset/change  successfully</p></center></body></html>");

		   }
		   else {
			   
				request.getRequestDispatcher("resetpassword.html").include(request, response);
				   writer.println("<html><body><p style='color:red'><center>you entered wrong  email address</center></p></body></html>");

		   }
		    
		    
		}
		else {
			request.getRequestDispatcher("resetpassword.html").include(request, response);
			   writer.println("<html><body><p style='color:red'><center>you entered wrong detail please valid  detail</center></p></body></html>");

		}
	}

}
