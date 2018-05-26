package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.StudentDB;
import model.to.Teacher;
@WebServlet("/GetDeptTeacherServlet")
public class GetDeptTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String tdept=request.getParameter("tdept");
	//System.out.print(tdept);
	StudentDB obj=new StudentDB();
	ArrayList<Teacher> a=obj.getTeacherByDept(tdept);
	if(a.isEmpty())
	{
		response.getWriter().print("No Teacher Present");
	}
	else
	{
		request.setAttribute("tname_att",a);
		request.getRequestDispatcher("selectdeptteacher.jsp").forward(request, response);
	}
}

}
