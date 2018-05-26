package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.AdminDB;
import model.to.Bulletin;

@WebServlet("/SaveBulletinServlet")
public class SaveBulletinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String srno=request.getParameter("srno");
		String info=request.getParameter("info");
		//System.out.print(srno+" "+info);
		Bulletin b=new Bulletin(srno,info);
		AdminDB a=new AdminDB();
		int y=a.saveBulletinInfo(b);
		if(y>0)
		{
			request.getRequestDispatcher("adminhome.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("<h1>Info in bulletin not saved</h1>");
		}
		
	}

}
