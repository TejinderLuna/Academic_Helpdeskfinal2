package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;
import model.to.StuResult;
@WebServlet("/SaveResultServlet")
public class SaveResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.println("helo");
		String regno[]=request.getParameterValues("regno");
		String name[]=request.getParameterValues("name");
		String branch=request.getParameter("branch");
		String sem=request.getParameter("sem");
		String mst=request.getParameter("mst");
		String subject=request.getParameter("subject");
		String mm=request.getParameter("mm");
		String pm=request.getParameter("pm");
		String om[]=request.getParameterValues("om");
		StuResult sr=null;
		UserDB udb=new UserDB();
		int y=0;
		for(int i=0;i<regno.length;i++)
		{	
		sr=new StuResult(regno[i],name[i],branch,sem,mst,subject,mm,pm,om[i]);
		y=udb.saveStudentResult(sr);
		}
		if(y>0)
		{
			request.getRequestDispatcher("teacherhome.jsp").forward(request,response);
		}
		else
		{
			response.getWriter().print("<h1>Result already saved</h1>");
		}
	}

}
