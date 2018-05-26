package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.HodDB;
import model.to.StuResult;

@WebServlet("/EditResultServlet")
public class EditResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String regno=request.getParameter("regno");
		String subject[]=request.getParameterValues("subject");
		String mm[]=request.getParameterValues("mm");
		String pm[]=request.getParameterValues("pm");
		String om[]=request.getParameterValues("om");
		//System.out.print(regno+" "+subject+" "+mm+" "+pm+" "+om);
		StuResult srt=null;
		HodDB hdb=new HodDB();
		int y=0;
		for(int i=0;i<subject.length;i++)
		{
			srt=new StuResult(regno,subject[i],mm[i],pm[i],om[i]);
			y=hdb.updateStuResult(srt);			
			//System.out.print(regno+" "+subject[i]+" "+mm[i]+" "+pm[i]+" "+om[i]);
		}
		if(y>0)
		{
			request.getRequestDispatcher("selectdepartmentmst.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("<h1>Failed to save result</h1>");
		}
	}

}
