package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;
@WebServlet("/HodIdAutoGenServlet")
public class HodIdAutoGenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeanDB obj=new DeanDB();
		int y=obj.getNextHodId();
		request.setAttribute("hid_att",y);
		request.getRequestDispatcher("registerhodform.jsp").forward(request, response);
		response.getWriter().print("<h`1>HOD ID can't be Generated</h1>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
