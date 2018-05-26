package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;
import model.to.Student;

@WebServlet("/SearchStudentServlet")
public class SearchStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	int regno=Integer.parseInt(request.getParameter("regno"));
	//System.out.print(regno);
	UserDB udb2=new UserDB();
	Student s=udb2.getStudentByRegno(regno);
	if(s!=null)
	{
	request.setAttribute("stu_obj",s);
	request.getRequestDispatcher("editstudentrecord.jsp").forward(request,response);
	}
	else
	{
		response.getWriter().print("<h1>Record does not Exists</h1>");
	}
	}
}
