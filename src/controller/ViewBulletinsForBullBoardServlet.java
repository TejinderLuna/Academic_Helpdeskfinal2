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


@WebServlet("/ViewBulletinsForBullBoardServlet")
public class ViewBulletinsForBullBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	//System.out.print("bulletin board");
		AdminDB adb=new AdminDB();
		ArrayList<Bulletin> a=adb.viewOnBulletinBoard();
		if(a.isEmpty())
		{
			response.getWriter().print("<h1>NO bulletins Present</h1>");
		}
		else
		{
			request.setAttribute("board_att",a);
			request.getRequestDispatcher("viewbulletinboard.jsp").forward(request,response);
		}
	}

}
