package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;
import model.to.HOD;

@WebServlet("/ViewAllDeptHodServlet")
public class ViewAllDeptHodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		DeanDB d=new DeanDB();
		ArrayList<HOD> a=d.viewAllHod();
		if(a.isEmpty())
		{
			response.getWriter().print("<h1>NO HOD Present</h1>");
		}
		else
		{
			request.setAttribute("HOD_list",a);
			request.getRequestDispatcher("viewallhod.jsp").forward(request, response);		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
