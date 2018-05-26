package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.HodDB;

@WebServlet("/DeleteTeacherServlet")
public class DeleteTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tid=Integer.parseInt(request.getParameter("tid"));
	    //System.out.print("tid is:"+tid);
		
		HodDB hdb=new HodDB();
	    int y=hdb.deleteTeacherById(tid);
	    if(y>0)
	    {
	    	request.getRequestDispatcher("selectdepartment.jsp").forward(request, response);
	    }
	    else
	    {
	    	response.getWriter().print("Failed To Delete");
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
	}

}
