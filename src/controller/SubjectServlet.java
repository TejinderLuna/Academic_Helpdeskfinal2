package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;

@WebServlet("/SubjectServlet")
public class SubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		System.out.print("Welcome Basic Servlet : "+id);
		if(id.equalsIgnoreCase("getsubjects"))
		{
			String branch=request.getParameter("branch");
			String sem=request.getParameter("sem");
			
			UserDB obj5=new UserDB();
			ArrayList<String>sublist=obj5.getSubjectsByBranch(branch,sem);
			if(!sublist.isEmpty())
			{
				System.out.print(sublist);
				request.setAttribute("sublist_att", sublist);
				request.getRequestDispatcher("viewsubjects.jsp").forward(request, response);
			}
		}
	}

}
