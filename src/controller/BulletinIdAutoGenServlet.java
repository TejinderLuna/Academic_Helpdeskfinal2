package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.AdminDB;

@WebServlet("/BulletinIdAutoGenServlet")
public class BulletinIdAutoGenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		AdminDB b=new AdminDB();
		String y=b.getSrNo();
		if(y!=null)
		{
			request.setAttribute("srno_att",y);
			request.getRequestDispatcher("bulletinboard.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("Failed to generate SrNo for Bulletin board");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
