package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Factory.DBcon;
import model.to.HOD;
import model.to.StuResult;
import model.to.Teacher;

public class HodDB 
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public HOD checkHodLogin(String type,String hid,String uname,String encpass)
	{
		con=DBcon.getDBcon();
		//boolean y=false;
		HOD h=null;
		try
		{
			ps=con.prepareStatement("select hname from hod_tab where hid=? and type=? and uname=? and encpass=?");
			ps.setString(1,hid);
			ps.setString(2,type);
			ps.setString(3,uname);
			ps.setString(4,encpass);
			rs=ps.executeQuery();
			if(rs.next())
			{
				System.out.println("inside if rst.next");
			h=new HOD(rs.getString("hname"));	
			//y=true;
			}	
		}
		catch(SQLException e)
		{
		System.out.println("SQL Exception while checking HOD login "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return h;
	}
	public int updateStuResult(StuResult srt)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("update result_tab set mm=?,pm=?,om=? where regno=? and subject=?");
			ps.setString(1,srt.getMm());
			ps.setString(2,srt.getPm());
			ps.setString(3,srt.getOm());
			ps.setString(4,srt.getRegno());
			ps.setString(5,srt.getSubject());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Updating Result "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public ArrayList<StuResult> getDeptResult(int regno,String tdept,String sem,String mst)
	{
		con=DBcon.getDBcon();
		StuResult sr=null;
		ArrayList<StuResult> a=new ArrayList<StuResult>();
		try
		{
		ps=con.prepareStatement("select * from result_tab where regno=? and branch=? and sem=? and mst=?");
		ps.setInt(1,regno);
		ps.setString(2,tdept);
		ps.setString(3,sem);
		ps.setString(4,mst);
		rs=ps.executeQuery();
		while(rs.next())
		{
		sr=new StuResult(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
		a.add(sr);
		}
		}
		catch(SQLException e)
		{
			System.out.print("SQL exception while getting Dept result by HOD "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	public int deleteTeacherById(int tid)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("delete from teacher_tab where tid=?");
			ps.setInt(1,tid);
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception while Deleting Teacher Record"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public ArrayList<Teacher> getDeptTeacher(String tdept)
	{
		con=DBcon.getDBcon();
		Teacher t=null;
		ArrayList<Teacher> a=new ArrayList<Teacher>(); 
		try
		{
			ps=con.prepareStatement("Select * from teacher_tab where tdept=?");
			ps.setString(1, tdept);
			rs=ps.executeQuery();
		while(rs.next())
		{
			t=new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
			a.add(t);
		}
		}
		catch(SQLException e)
		{
			System.out.print("SQL exception while viewing teachers" +e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
	return a;
	}
	
	public int updateTeacher(Teacher t)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("update teacher_tab set tid=?,tname=?,type=?,fname=?,dob=?,gender=?,tqual=?,kskills=?,desig=?,tdept=?,contact=?,email=?,address=?,uname=? where tid=?");
			ps.setInt(1,t.getTid());
			ps.setString(2,t.getTname());
			ps.setString(3,t.getType());
			ps.setString(4,t.getFname());
			ps.setString(5,t.getDob());
			ps.setString(6,t.getGender());
			ps.setString(7,t.getTqual());
			ps.setString(8,t.getKskills());
			ps.setString(9,t.getDesig());
			ps.setString(10,t.getTdept());
			ps.setString(11,t.getContact());
			ps.setString(12,t.getEmail());
			ps.setString(13,t.getAddress());
			ps.setString(14,t.getUname());
			ps.setInt(15,t.getTid());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}			
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While updating teacher"+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;
	}
	public Teacher getTeacherByTid(int tid)
	{
		con=DBcon.getDBcon();
		Teacher t=null;
		try
		{
			ps=con.prepareStatement("select * from teacher_tab where tid=?");
			ps.setInt(1,tid);
			rs=ps.executeQuery();
			if(rs.next())
			{
			t=new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Fetching Teacher"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return t;
	}
	public int registerTeacher(Teacher t)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into teacher_tab values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,t.getTid());
			ps.setString(2,t.getTname());
			ps.setString(3,t.getType());
			ps.setString(4,t.getFname());
			ps.setString(5,t.getDob());
			ps.setString(6,t.getGender());
			ps.setString(7,t.getTqual());
			ps.setString(8,t.getKskills());
			ps.setString(9,t.getDesig());
			ps.setString(10,t.getTdept());
			ps.setString(11,t.getContact());
			ps.setString(12,t.getEmail());
			ps.setString(13,t.getAddress());
			ps.setString(14,t.getUname());
			ps.setString(15,t.getEncpass());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
			
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Registering Teacher"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	
	public int getNextTeacherId()
	{
		con=DBcon.getDBcon();
		int y=0;
		try 
		{
		ps=con.prepareStatement("select * from teacher_tab order by tid");
		rs=ps.executeQuery();
		if(rs.last())
		{
			y=rs.getInt("tid")+1;
		}
		else
			y=11001;	
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Auto Gen teacher id."+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;
	}
}