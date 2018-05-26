package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;


@WebServlet("/UpdateLeaveStatusServlet")
public class UpdateLeaveStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String lid[]=request.getParameterValues("lid");
		String status[]=request.getParameterValues("status");
		int y=0;
		UserDB obj=new UserDB();
		int i;
		for(i=0;i<lid.length;i++)
		{
			//System.out.print(lid[i]+" "+status[i]);
			y=obj.updateLeaveStatus(lid[i],status[i]);
		}
		if(y>0)
		{
			request.getRequestDispatcher("teacherhome.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("Leave Status Updation Failed");
		}
	}
}