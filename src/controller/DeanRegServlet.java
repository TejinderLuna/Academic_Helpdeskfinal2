package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.AdminDB;
import model.DAO.EmailPojo;
import model.business.Encrypt;
import model.to.Dean;

@WebServlet("/DeanRegServlet")
public class DeanRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String did=request.getParameter("did");
	String dname=request.getParameter("dname");
	String fname=request.getParameter("fname");
	String type=request.getParameter("type");
	String dob=request.getParameter("dob");
	String gender=request.getParameter("gender");
	String dqual=request.getParameter("dqual");
	String exp=request.getParameter("exp");
	String contact=request.getParameter("contact");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	String encpass=Encrypt.getEncryptedPassword(pass);
	//System.out.print(did+" "+dname+" "+fname+" "+type+" "+dob+" "+gender+" "+dqual+" "+exp+" "+contact+" "+email+" "+address+" "+uname+" "+encpass);
	EmailPojo ep=new EmailPojo();
	Dean d=new Dean(did,dname,fname,type,dob,gender,dqual,exp,contact,email,address,uname,encpass);
	AdminDB a=new AdminDB();
	int y=a.registerDean(d);
	if(y>0)
	{
		ep.regEmail(dname,did,uname,pass,email);
		request.getRequestDispatcher("adminhome.jsp").forward(request, response);
	}
	else
	{
		response.getWriter().print("<h1>failed to register dean</h1>");
	}
	}
}
