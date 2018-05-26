package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.EmailPojo;
import model.DAO.UserDB;
import model.business.Encrypt;
import model.to.Student;

@WebServlet("/StudentRegServlet")
public class StudentRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int regno=Integer.parseInt(request.getParameter("regno"));
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String dob=request.getParameter("dob");
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String branch=request.getParameter("branch");
		String sem=request.getParameter("sem");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		//System.out.print(" "+name+" "+gender+" "+fname+" "+mname+" "+dob+" "+state+" "+city+" "+address+" "+contact+" "+email+" "+branch+" "+uname+" "+pass);
		String encpass=Encrypt.getEncryptedPassword(pass); 
		//System.out.print(" "+name+" "+gender+" "+fname+" "+mname+" "+dob+" "+state+" "+city+" "+address+" "+contact+" "+email+" "+branch+" "+uname+" "+enc);
		EmailPojo ep=new EmailPojo();
		Student s=new Student(regno,name,gender,fname,mname,dob,state,city,address,contact,email,branch,sem,uname,encpass);
		UserDB udb1=new UserDB();
		int y=udb1.registerStudent(s);
		if(y>0)
		{
			String id=String.valueOf(regno);
			ep.regEmail(name,id,uname,pass,email);
			request.getRequestDispatcher("teacherhome.jsp").forward(request,response);
		}
		else
		{
			response.getWriter().print("<h1>Record Not Saved</h1>");
		}
	}

}
