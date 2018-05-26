package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;

@WebServlet("/RegAutoGenServlet")
public class RegAutoGenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String id=request.getParameter("id");
	if(id.equalsIgnoreCase("regautogen"))
	{
		UserDB udb=new UserDB();
		int regno=udb.getNextRegno();
		request.setAttribute("regno_att",regno);
		
		request.getRequestDispatcher("regstu.jsp").forward(request,response);
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
