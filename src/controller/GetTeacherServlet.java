package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.HodDB;
import model.to.Teacher;
@WebServlet("/GetTeacherServlet")
public class GetTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    int tid=Integer.parseInt(request.getParameter("tid"));
    //System.out.print("tid is=" +tid);
    //HttpSession session=request.getSession(false);
    HodDB hdb=new HodDB();
    Teacher t=hdb.getTeacherByTid(tid);
    if(t!=null)
    {
    	request.setAttribute("tobj_att",t);
    	request.getRequestDispatcher("editteacher.jsp").forward(request, response);
    }
    else
    {
    	response.getWriter().print("<h1>Teacher Record Doesn't Exists</h1>");
    }
	}

}
