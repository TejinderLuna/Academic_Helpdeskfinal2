package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.AdminDB;

@WebServlet("/DeleteBulletinServlet")
public class DeleteBulletinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String srno=request.getParameter("srno");
		System.out.print(srno);
		AdminDB adb=new AdminDB();
		int y=adb.deleteBulletinInfo(srno);
		if(y>0)
		{
			
			request.getRequestDispatcher("ViewBulletinInfoServlet").forward(request, response);
		}
		else
		{
			response.getWriter().print("<h1>Failed to delete Bulletin info</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
