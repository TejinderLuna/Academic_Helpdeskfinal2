package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.StudentDB;
import model.to.StuLeave;

@WebServlet("/ViewLeaveStatusServlet")
public class ViewLeaveStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String regno=request.getParameter("regno");
		//System.out.print(regno);
		StudentDB sdb=new StudentDB();
		ArrayList<StuLeave> a=sdb.getLeaveStatusByRegno(regno);
		if(a.isEmpty())
		{
			response.getWriter().print("<h1>No Leave Applied</h1>");
		}
		else
		{
			request.setAttribute("stuleaves_att",a);
			request.getRequestDispatcher("stuleavestatus.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
