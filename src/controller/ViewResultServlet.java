package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO.StudentDB;
import model.to.StuResult;

@WebServlet("/ViewResultServlet")
public class ViewResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		//String uname=request.getParameter("uname");
		String branch=request.getParameter("branch");
		String sem=request.getParameter("sem");
		String mst=request.getParameter("mst");
		//System.out.print(regno+" "+branch+" "+sem+" "+mst );
		StudentDB sdb=new StudentDB();
		ArrayList<StuResult> a=sdb.getStuResult(regno,branch,sem,mst);
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			if(a.isEmpty())
					{
					response.getWriter().print("<h1>Result not present</h1>");
					}
			else
				{
				request.setAttribute("result_att",a);
				request.getRequestDispatcher("viewresult.jsp").forward(request,response);
				}
		}
		else
		{
			response.getWriter().print("<h1>Session Expired, Login Again</h1>");
		}
		
	}

}
