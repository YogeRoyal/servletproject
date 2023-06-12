package com.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
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
        String mobileNo = request.getParameter("number");
        String password = request.getParameter("password");
		String[] data = UserDAO.search(mobileNo,password);
		writer.println("<html><body><center>");
        writer.println("<table border=\"2px\"><tr>"
        		+ "<th>Email</th>"
        		+ "<th>Username</th>"
        		+ "<th>Password</th>"
        		+ "<th>Number</th>"
        		+ "<th>Qualification</th>"
        		+ "<th>Gender</th>"
        		+ "<th>Technologies</th>"
        		+ "<th>Country</th>"
        		+ "<th>Address</th>"
        		+ "<th>Review</th>"
        		+ "</tr><tr>");
		for(String d:data)
		{	writer.println("<td>");
			writer.println(d);
			writer.println("</td>");
		}
		writer.println("</tr></table>");
		writer.print("<a href='Home.html'>Click here to goto home page</a></center>");
		writer.println("</body></html>");
	}
}

