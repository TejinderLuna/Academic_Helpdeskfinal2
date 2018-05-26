package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.AdminDB;
import model.to.Bulletin;


@WebServlet("/ViewBulletinInfoServlet")
public class ViewBulletinInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AdminDB adb=new AdminDB();
		ArrayList<Bulletin> a=adb.viewAllBulletinInfo();
		if(a.isEmpty())
		{
			response.getWriter().print("<h1>NO bulletins Present</h1>");
		}
		else
		{
			request.setAttribute("bul_att",a);
			request.getRequestDispatcher("viewbulletinsinfo.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
