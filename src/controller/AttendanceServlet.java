package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;
import model.to.Attendance;

@WebServlet("/AttendanceServlet")
public class AttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		switch(id)
		{
			case "saveattendance":
				int total=Integer.parseInt(request.getParameter("total"));
				String subject=request.getParameter("subject");
				String regno[]=request.getParameterValues("regno");
				String name[]=request.getParameterValues("name");
				String branch[]=request.getParameterValues("branch");
				String sem[]=request.getParameterValues("sem");
				String present[]=request.getParameterValues("present");
				System.out.println(" : "+regno.length);
				double per=0.0;
				UserDB udb5=new UserDB();
				Attendance a=null;
				int y=0;
				
				for(int i=0;i<regno.length;i++)
				{	
					per=((Integer.parseInt(present[i]))*100)/total;
					System.out.println(per);
					a=new Attendance(total,subject,regno[i],name[i],branch[i],sem[i],present[i],per);
					y=udb5.saveAttendance(a);
				}
				if(y>0)
				{
					request.getRequestDispatcher("teacherhome.jsp").forward(request,response);
				}
				else
				{
					response.getWriter().print("<h1>Attendance already exists</h1>");
				}
				
				
			break;	
		}
	}

}
