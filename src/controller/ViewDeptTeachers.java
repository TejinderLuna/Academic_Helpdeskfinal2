package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.HodDB;
import model.to.Teacher;

@WebServlet("/ViewDeptTeachers")
public class ViewDeptTeachers extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String tdept=request.getParameter("tdept");
		HodDB hdb=new HodDB();
		ArrayList<Teacher> a=hdb.getDeptTeacher(tdept);
		if(a.isEmpty())
		{
			response.getWriter().print("<h1>Record not present</h1>");
		}		
		else
		{
			request.setAttribute("teacher_att", a);
			request.setAttribute("dept_att",tdept);
			request.getRequestDispatcher("viewdeptteachers.jsp").forward(request,response);
		}
	}

}
