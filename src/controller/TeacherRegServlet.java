package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.EmailPojo;
import model.DAO.HodDB;
import model.business.Encrypt;
import model.to.Teacher;

@WebServlet("/TeacherRegServlet")
public class TeacherRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	int tid=Integer.parseInt(request.getParameter("tid"));
	String tname=request.getParameter("tname");
	String type=request.getParameter("type");
	String fname=request.getParameter("fname");
	String dob=request.getParameter("dob");
	String gender=request.getParameter("gender");
	String tqual=request.getParameter("tqual");
	String kskills=request.getParameter("kskills");
	String desig=request.getParameter("desig");
	String tdept=request.getParameter("tdept");
	String contact=request.getParameter("contact");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	String encpass=Encrypt.getEncryptedPassword(pass);
	//System.out.print(tid+" "+tname+" "+type+" "+fname+" "+dob+" "+gender+" "+tqual+" "+kskills+" "+desig+" "+tdept+" "+contact+" "+email+" "+address+" "+uname+" "+encpass);
	EmailPojo ep=new EmailPojo();
	HodDB hdb=new HodDB();
	Teacher t=new Teacher(tid,tname,type,fname,dob,gender,tqual,kskills,desig,tdept,contact,email,address,uname,encpass);
	int y=hdb.registerTeacher(t);
	if(y>0)
	{
		String id=String.valueOf(tid);
		ep.regEmail(tname,id,uname,pass,email);
		request.getRequestDispatcher("hodhome.jsp").forward(request, response);
	}
	else
	{
		response.getWriter().print("<h1>Teacher Not Saved</h1>");
	}
}
	

}
