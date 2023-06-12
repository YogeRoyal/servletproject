package com.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		 String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 String mobileNo=request.getParameter("number");
		 String [] qualification=request.getParameterValues("qualification");
		 String gender=request.getParameter("gender");
		 String [] technologies=request.getParameterValues("technologies");
		 String  country=request.getParameter("country");
		 String [] address=request.getParameterValues("address");
	     String review = request.getParameter("review");
	     
	     	String totalQual = String.join(",", qualification);
			String totalTech = String.join(",", technologies);
			String totalAddrs = String.join(",", address);
         
       int count=UserDAO.save(email,username,password,mobileNo,totalQual,gender,totalTech,country,totalAddrs,review);
       if(count==1) {
    	   RequestDispatcher dispatcher = request.getRequestDispatcher("regsuccess.jsp");
 	      dispatcher.forward(request, response);
        	}
        	else {
        		RequestDispatcher dispatcher = request.getRequestDispatcher("registration.html");
      	      dispatcher.forward(request, response);
        	}
         
	}

	}


