package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;
import model.to.Placement;


@WebServlet("/ViewPlacementInfoServlet")
public class ViewPlacementInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	DeanDB d=new DeanDB();
	ArrayList<Placement> a=d.getPlacementInfo();
	if(a.isEmpty())
	{
		response.getWriter().print("NO companies present");
	}
	else
	{
		request.setAttribute("plcmnt_att",a);
		request.getRequestDispatcher("viewcompanylist.jsp").forward(request,response);
	}
	

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
