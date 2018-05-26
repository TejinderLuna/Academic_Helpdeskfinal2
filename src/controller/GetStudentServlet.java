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


@WebServlet("/GetStudentServlet")
public class GetStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		String branch=request.getParameter("branch");
		String sem=request.getParameter("sem");
		if(id.equalsIgnoreCase("getstudent"))
		{
			UserDB obj6=new UserDB();
			ArrayList<Student>stulist=obj6.getStuByNameBranch(branch,sem);
			if(!stulist.isEmpty())
			{
				System.out.print(stulist);
				request.setAttribute("stulist_att", stulist);
				request.getRequestDispatcher("viewstuforresult.jsp").forward(request, response);
			}
			else
			{
				response.getWriter().print("no students present");
			}
			
		}
	}

}
