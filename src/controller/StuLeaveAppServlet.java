package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;
import model.to.StuLeave;

@WebServlet("/StuLeaveAppServlet")
public class StuLeaveAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
     String tname=request.getParameter("tname");
     //System.out.print(tname);
     UserDB udb=new UserDB();
     ArrayList<StuLeave> a=udb.getLeaveApplication(tname);
     if (a.isEmpty())
     {
    	 response.getWriter().print("<h1>NO LEAVE APPLICATION PRESENT</h1>");
     }
     else
     {
    	 request.setAttribute("leaves_att",a);
    	 request.getRequestDispatcher("viewleaveapp.jsp").forward(request, response);
     }
     
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
	}

}
