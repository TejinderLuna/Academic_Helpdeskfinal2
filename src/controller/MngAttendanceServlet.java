package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;
import model.to.Student;

@WebServlet("/MngAttendanceServlet")
public class MngAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String branch=request.getParameter("branch");
		String sem=request.getParameter("sem");
		System.out.println(branch+" "+sem);
		UserDB udb3=new UserDB();
		ArrayList<Student> b=udb3.getStuByNameBranch(branch,sem);
		ArrayList<String> sublist=udb3.getSubjectsByBranch(branch, sem);
			if(b.isEmpty())
			{
				response.getWriter().print("no record found");
			}
			else
			{
				request.setAttribute("sublist_att",sublist);
				request.setAttribute("attendance_att",b);
				request.getRequestDispatcher("stuattendance.jsp").forward(request,response);
			}			
	}
	

}
