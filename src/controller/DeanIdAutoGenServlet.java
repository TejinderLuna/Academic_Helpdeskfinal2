package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.AdminDB;

@WebServlet("/DeanIdAutoGenServlet")
public class DeanIdAutoGenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AdminDB adb=new AdminDB();
		String s=adb.getNextDeanId();
		if(s!=null)
		{
			request.setAttribute("did_att",s);
			request.getRequestDispatcher("regdean.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("<h1>dean ID generation failed</h1>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
