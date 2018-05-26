package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO.DeanDB;
import model.to.Placement;

@WebServlet("/SavePlacementInfoServlet")
public class SavePlacementInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String srno=request.getParameter("srno");
		String cname=request.getParameter("cname");
		String cdesc=request.getParameter("cdesc");
		String eligibility=request.getParameter("eligibility");
		String skills=request.getParameter("skills");
		String loc=request.getParameter("loc");
		String post=request.getParameter("post");
		String pkg=request.getParameter("pkg");
		String nor=request.getParameter("nor");
		String round=request.getParameter("round");
		String doa=request.getParameter("doa");
		String rtime=request.getParameter("rtime");
		String nov=request.getParameter("nov");
		String status=request.getParameter("status");
		System.out.print(srno+" "+cname+" "+cdesc+" "+eligibility+" "+skills+" "+loc+" "+post+" "+pkg+" "+nor+" "+round+" "+doa+" "+rtime+" "+nov+" "+status);
		Placement p=new Placement(srno,cname,cdesc,eligibility,skills,loc,post,pkg,nor,round,doa,rtime,nov,status);
		DeanDB db=new DeanDB();
		int y=db.savePlacementInfo(p);
		if(y>0)
		{
			request.getRequestDispatcher("deanhome.jsp").forward(request, response);
		}
		else
		{
			response.getWriter().print("<h1>Placement Info not saved</h1>");
		}
	}
}
