package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Factory.DBcon;
import model.to.Attendance;
import model.to.StuLeave;
import model.to.StuResult;
import model.to.Teacher;

public class StudentDB 
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public ArrayList<StuLeave> getLeaveStatusByRegno(String regno)
	{
		con=DBcon.getDBcon();
		StuLeave s1=null;
		ArrayList<StuLeave> a=new ArrayList<StuLeave>();
		try
		{
			ps=con.prepareStatement("select * from stuleave_tab where regno=?");
			ps.setString(1,regno);
			rs=ps.executeQuery();
			while(rs.next())
			{
				s1=new StuLeave(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				a.add(s1);
			}
		}
		catch(SQLException e)
		{
			System.out.println("SQL Exception while getting leave status by Student "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	public ArrayList<Teacher> getTeacherByDept(String tdept)
	{
		con=DBcon.getDBcon();
		ArrayList<Teacher> a=new ArrayList<Teacher>();
		Teacher t=null;
		try
		{
			ps=con.prepareStatement("select tname from teacher_tab where tdept=?");
			ps.setString(1,tdept);
			rs=ps.executeQuery();
			while(rs.next())
			{
				t=new Teacher(rs.getString("tname"));
				a.add(t);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Getting Teacher By Dept"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	public int saveApplyLeave(StuLeave s1)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into stuleave_tab values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,s1.getRegno());
			ps.setString(2,s1.getLid());
			ps.setString(3,s1.getTdept());
			ps.setString(4,s1.getTname());
			ps.setString(5,s1.getSem());
			ps.setString(6,s1.getHostel());
			ps.setString(7,s1.getSubject());
			ps.setString(8,s1.getTo());
			ps.setString(9,s1.getFrom());
			ps.setString(10,s1.getCd());
			ps.setString(11,s1.getStatus());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Saving Student Leave"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public int getNextLeaveid()
	{
	con=DBcon.getDBcon();
	int y=0;
	try 
	{
	ps=con.prepareStatement("select * from stuleave_tab order by lid");
	rs=ps.executeQuery();
	if(rs.last())
	{
		y=rs.getInt("lid")+7;
	}
	else
		y=1057;	
	}
	catch(SQLException e)
	{
		System.out.print("SQL Exception While Auto Gen Leave id no."+e);
	}
	finally
	{
	 DBcon.freeDBcon(con);
	}
	return y;
	}
	public ArrayList<Attendance> getStuAttendance(int regno,String branch,String sem)
	{
		con=DBcon.getDBcon();
		ArrayList<Attendance> a=new ArrayList<Attendance>();
		Attendance at=null;
		try
		{
			ps=con.prepareStatement("select * from attendance_tab where regno=? and branch=? and sem=?");
			ps.setInt(1,regno);
			ps.setString(2,branch);
			ps.setString(3,sem);
			rs=ps.executeQuery();
			while(rs.next())
			{
				at=new Attendance(rs.getString("regno"),rs.getString("subject"),rs.getInt("total"),rs.getString("present"),rs.getDouble("per"));
				a.add(at);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Viewing Attendance "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		
		return a;
	}
	public ArrayList<StuResult> getStuResult(int regno,String branch,String sem,String mst)
	{
		con=DBcon.getDBcon();
		ArrayList<StuResult> a=new ArrayList<StuResult>();
		StuResult sr=null;
		try
		{
			ps=con.prepareStatement("select * from result_tab where regno=? and branch=? and sem=? and mst=?");
			ps.setInt(1,regno);
			ps.setString(2,branch);
			ps.setString(3,sem);
			ps.setString(4,mst);
			rs=ps.executeQuery();
			while(rs.next())
			{
				sr=new StuResult(rs.getString("regno"),rs.getString("subject"),rs.getString("mm"),rs.getString("pm"),rs.getString("om"));
				a.add(sr);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Viewing Result");
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	
	public boolean checkStudentLogin(int regno,String uname,String encpass)
	{
	con=DBcon.getDBcon();
	boolean y=false; 
	try
	{
		ps=con.prepareStatement("select * from student_tab where regno=? and uname=? and encpass=?");
		ps.setInt(1,regno);
		ps.setString(2,uname);
		ps.setString(3,encpass);
		rs=ps.executeQuery();
		if(rs.next())
		{
		y=true;
		}	
	}
	catch(SQLException e)
	{
	System.out.println("SQL Exception while checking student login "+e);
	}
	finally
	{
		DBcon.freeDBcon(con);
	}
	return y;
	}
}
