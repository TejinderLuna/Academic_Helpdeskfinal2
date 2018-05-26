package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;
import model.DAO.EmailPojo;
import model.business.Encrypt;
import model.to.HOD;

@WebServlet("/HodRegServlet")
public class HodRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String hid=request.getParameter("hid");
		String hname=request.getParameter("hname");
		String fname=request.getParameter("fname");
		String type=request.getParameter("type");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String hqual=request.getParameter("hqual");
		String kskills=request.getParameter("kskills");
		String hdept=request.getParameter("hdept");
		String contact=request.getParameter("contact");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String encpass=Encrypt.getEncryptedPassword(pass);
		//System.out.print(hname+" "+fname+" "+type+" "+dob+" "+gender+" "+hqual+" "+kskills+" "+hdept+" "+contact+" "+email+" "+address+" "+uname+" "+encpass);
		EmailPojo ep=new EmailPojo();
		HOD h=new HOD(hid,hname,fname,type,dob,gender,hqual,kskills,hdept,contact,email,address,uname,encpass);
		DeanDB dbj=new DeanDB();
		int y=dbj.registerHod(h);
		if(y>0)
		{
			ep.regEmail(hname,hid,uname,pass,email);
			request.getRequestDispatcher("deanhome.jsp").forward(request,response);
		}
	}

}
