package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.EmailPojo;


@WebServlet("/SendEmailServlet")
public class SendEmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname=request.getParameter("uname");
		String from=request.getParameter("from");
		String email=request.getParameter("email");
		String query=request.getParameter("query");
		System.out.print(uname+" "+from+" "+email+" "+query);
		EmailPojo ep=new EmailPojo();
		boolean f=ep.sendEmail(uname,from,email,query);
		if(f==true)
		{
			response.getWriter().print("<h1>Query Sent</h1>");
		}
	}

}
