package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;

@WebServlet("/SrnoAutoGenServlet")
public class SrnoAutoGenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		DeanDB d=new DeanDB();
		String y=d.getNextSerialNo();
		if(y!=null)
		{
			request.setAttribute("srno_att",y);
			request.getRequestDispatcher("placementform.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("unable to auto generate serial no");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
