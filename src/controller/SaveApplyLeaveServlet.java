package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.StudentDB;
import model.to.StuLeave;


@WebServlet("/SaveApplyLeaveServlet")
public class SaveApplyLeaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String regno=request.getParameter("regno");
		String lid=request.getParameter("lid");
		String tdept=request.getParameter("tdept");
		String tname=request.getParameter("tname");
		String sem=request.getParameter("sem");
		String hostel=request.getParameter("hostel");
		String subject=request.getParameter("subject");
		String to=request.getParameter("to");
		String from=request.getParameter("from");
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String cd=sdf.format(d);
		String status="pending";
		//System.out.print(regno+" "+lid+" "+hostel+" "+subject+" "+to+" "+from+" "+nd+" "+approved);
		StuLeave s1=new StuLeave(regno,lid,tdept,tname,sem,hostel,subject,to,from,cd,status);
		StudentDB sdb=new StudentDB();
		int y=sdb.saveApplyLeave(s1);
		if(y>0)
		{
			request.getRequestDispatcher("studenthome.jsp").forward(request, response);
			
		}
		else
		{
			response.getWriter().print("Leave Not Saved");
		}
	}

}
