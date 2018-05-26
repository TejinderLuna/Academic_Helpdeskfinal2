package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;
import model.to.HOD;

@WebServlet("/GetHodServlet")
public class GetHodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String hid=request.getParameter("hid");
	System.out.println(hid);
	DeanDB db=new DeanDB();
	HOD a=db.getHodByHid(hid);
	System.out.println(a);
	if(a!=null)
	{
		request.setAttribute("hod_att",a);
		request.getRequestDispatcher("edithod.jsp").forward(request, response);
	}
	else
	{
		response.getWriter().print("<h1>Wrong ID or ID NOT FOUND</h1>");
	}
	}

}
