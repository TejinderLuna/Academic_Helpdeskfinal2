package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO.StudentDB;
import model.business.Encrypt;
@WebServlet("/StudentLoginServlet")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String encpass=Encrypt.getEncryptedPassword(pass);
		StudentDB sdb=new StudentDB();
		boolean y=sdb.checkStudentLogin(regno,uname,encpass);
		if(y)
		{
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(300);
		session.setAttribute("uname_att", uname);
		session.setAttribute("regno_att", regno);
		response.getWriter().print("1");
		}
		else
		{
		response.getWriter().print("0");
		}
		
		
	}

}
