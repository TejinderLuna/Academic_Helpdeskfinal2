package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.UserDB;

@WebServlet("/DelStudentServlet")
public class DelStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	int regno=Integer.parseInt(request.getParameter("regno"));
	UserDB udb3=new UserDB();
	int y=udb3.deleteStudentByRegno(regno);
	if(y>0)
	{
	request.getRequestDispatcher("ViewStudentServlet").forward(request, response);
	}
	else
	response.getWriter().print("Student not deleted");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
