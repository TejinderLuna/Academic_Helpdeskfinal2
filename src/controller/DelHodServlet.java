package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;
@WebServlet("/DelHodServlet")
public class DelHodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	String hid=request.getParameter("hid");
	//System.out.print(hid);
	DeanDB obj=new DeanDB();
	int y=0;
	y=obj.delHodById(hid);
	if(y>0)
	{
		request.getRequestDispatcher("ViewAllDeptHodServlet").forward(request, response);
	}
	else
	{
		response.getWriter().print("Deletion of Hod Failed");
	}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
