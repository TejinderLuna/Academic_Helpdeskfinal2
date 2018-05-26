package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO.AdminDB;
import model.DAO.DeanDB;
import model.DAO.HodDB;
import model.DAO.UserDB;
import model.business.Encrypt;
import model.to.Dean;
import model.to.HOD;
import model.to.Teacher;

@WebServlet("/TeacherLoginServlet")
public class TeacherLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String type=request.getParameter("type");
	int tid=Integer.parseInt(request.getParameter("tid"));
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	//System.out.print(type+" "+id+" "+uname+" "+pass);
	String encpass=Encrypt.getEncryptedPassword(pass);
	switch(type)
	{
	case "Teacher":
	UserDB udb=new UserDB();
	Teacher t=udb.checkTeacherLogin(type,tid,uname,encpass);
	//System.out.print(y);
			if(t!=null)
			{
				HttpSession session=request.getSession();
				session.setMaxInactiveInterval(300);
				session.setAttribute("uname_att", uname);
				session.setAttribute("tid_att",tid);
				session.setAttribute("tname_att",t);
				response.getWriter().print("1");
			}
			else
			{
				response.getWriter().print("0");
			}
			break;
	case "HOD":
		HodDB hdb=new HodDB();
		String hid=String.valueOf(tid);
		HOD y=hdb.checkHodLogin(type,hid,uname,encpass);
		//System.out.print(y);
				if(y!=null)
				{
					HttpSession session=request.getSession();
					session.setMaxInactiveInterval(300);
					session.setAttribute("uname_att", uname);
					session.setAttribute("hid_att",hid);
					session.setAttribute("hname_att",y);
					response.getWriter().print("2");
				}
				else
				{
					response.getWriter().print("0");
				}
				break;
	case "Dean":
		DeanDB d=new DeanDB();
		String did=String.valueOf(tid);
		Dean a=d.checkDeanLogin(type,did,uname,encpass);
		System.out.print(a);
		//System.out.print(y);
				if(a!=null)
				{
					HttpSession session=request.getSession();
					session.setMaxInactiveInterval(300);
					session.setAttribute("uname_att", uname);
					session.setAttribute("hid_att",did);
					session.setAttribute("dname_att",a);
					response.getWriter().print("3");
				}
				else
				{
					response.getWriter().print("0");
				}
				break;
	case "Admin":
		AdminDB adb=new AdminDB();
		String aid=String.valueOf(tid);
		boolean v=adb.checkAdminLogin(type,aid,uname,pass);
		//System.out.print(a);
		//System.out.print(v);
				if(v)
				{
					HttpSession session=request.getSession();
					session.setMaxInactiveInterval(300);
					session.setAttribute("uname_att", uname);
					session.setAttribute("aid_att",aid);
					response.getWriter().print("4");
				}
				else
				{
					response.getWriter().print("0");
				}
				break;
	}
	}
}

