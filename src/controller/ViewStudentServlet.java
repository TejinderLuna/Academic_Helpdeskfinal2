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
@WebServlet("/ViewStudentServlet")
public class ViewStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
				//System.out.println("welcome to do get method");
				UserDB edb2=new UserDB();
				ArrayList<Student> a=edb2.getAllStudents();
				if(a!=null)
				{
				request.setAttribute("stu_obj",a);
				request.getRequestDispatcher("viewstu.jsp").forward(request, response);
				}
				else
				response.getWriter().print("<h1>NO Student REGISTERED</h1>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
