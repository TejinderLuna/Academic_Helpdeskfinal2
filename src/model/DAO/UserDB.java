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
import model.to.Student;
import model.to.Teacher;

public class UserDB 
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public int updateLeaveStatus(String lid,String status)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("update stuleave_tab set status=? where lid=? ");
			ps.setString(1,status);
			ps.setString(2,lid);
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Updating Leave Status"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public ArrayList<StuLeave> getLeaveApplication(String tname)
	{
		con=DBcon.getDBcon();
		StuLeave s1=null;
		ArrayList<StuLeave> a=new ArrayList<StuLeave>();
		try
		{
			ps=con.prepareStatement("select * from stuleave_tab where tname=?");
			ps.setString(1,tname);
			rs=ps.executeQuery();
			while(rs.next())
			{
			s1=new StuLeave(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
			a.add(s1);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception while viewing leave application "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	public Teacher checkTeacherLogin(String type,int tid,String uname,String encpass)
	{
		//System.out.println("checkTeacherLogin : "+type+" "+uname+" "+encpass);
	con=DBcon.getDBcon();
	//boolean y=false;
	Teacher t=null;
	try
	{
		ps=con.prepareStatement("select tname from teacher_tab where tid=? and type=? and uname=? and encpass=?");
		ps.setInt(1,tid);
		ps.setString(2,type);
		ps.setString(3,uname);
		ps.setString(4,encpass);
		rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println("inside if rst.next");
		t=new Teacher(rs.getString("tname"));	
		//y=true;
		}	
	}
	catch(SQLException e)
	{
	System.out.println("SQL Exception while checking teacher login "+e);
	}
	finally
	{
		DBcon.freeDBcon(con);
	}
	return t;
	}


	public int saveStudentResult(StuResult sr)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into result_tab values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,sr.getRegno());
			ps.setString(2,sr.getName());
			ps.setString(3,sr.getBranch());
			ps.setString(4,sr.getSem());
			ps.setString(5,sr.getMst());
			ps.setString(6,sr.getSubject());
			ps.setString(7,sr.getMm());
			ps.setString(8,sr.getPm());
			ps.setString(9,sr.getOm());
			y=ps.executeUpdate();
			if(y>0)
			{
			y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Saving RESULT"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public int saveAttendance(Attendance a)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into Attendance_tab values(?,?,?,?,?,?,?,?)");
			ps.setInt(1,a.getTotal());
			ps.setString(2,a.getSubject());
			ps.setString(3,a.getRegno());
			ps.setString(4,a.getName());
			ps.setString(5,a.getBranch());
			ps.setString(6,a.getSem());
			ps.setString(7,a.getPresent());
			ps.setDouble(8,a.getPer());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}			
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Saving Attendance"+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;
	}
	public ArrayList<String> getSubjectsByBranch(String branch,String sem)
	{
		con=DBcon.getDBcon();
		ArrayList<String> sublist=new ArrayList<String>();
		System.out.print("getSBB");
		try
		{
			ps=con.prepareStatement("select subject from subject_tab where branch=? and semester=? ");
			ps.setString(1,branch);
			ps.setString(2,sem);
			rs=ps.executeQuery();
				while(rs.next())
				{
					sublist.add(rs.getString("subject"));
				}
				
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Getting Subject");
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return sublist;
	}
	public ArrayList<Student> getStuByNameBranch(String branch,String sem)
	{
		con=DBcon.getDBcon();
		Student s=null;
		ArrayList<Student> a=new ArrayList<Student>();
		try
		{
			ps=con.prepareStatement("select * from student_tab where branch=? and sem=?");
			ps.setString(1,branch);
			ps.setString(2,sem);
			rs=ps.executeQuery();
			while(rs.next())
			{
			s=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
			a.add(s);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception in getStuByNameBranch"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	public int deleteStudentByRegno(int regno)
	{
	con=DBcon.getDBcon();
	int y=0;
	try
	{
		ps=con.prepareStatement("delete from student_tab where regno=?");
		ps.setInt(1,regno);
		y=ps.executeUpdate();
		if(y>0)
		{
		 y=1;
		}
	}
	catch(SQLException e)
	{
		System.out.println("Sql Exception while deleting user "+e);
	}
	finally
	{
		DBcon.freeDBcon(con);
	}
	return y;
	}
	public ArrayList<Student> getAllStudents()
	{
		con=DBcon.getDBcon();
		ArrayList<Student> stu=new ArrayList<Student>();
		Student sturef=null;
		try
		{
			ps=con.prepareStatement("select * from student_tab");
			rs=ps.executeQuery();
			while(rs.next())
			{
				sturef=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
				stu.add(sturef);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL EXCEPTION while viewing Students");
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return stu;
	}
	public int updateStudent(Student s)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("update student_tab set regno=?,name=?,gender=?,fname=?,mname=?,dob=?,state=?,city=?,address=?,contact=?,email=?,branch=?,sem=?,uname=?,encpass=? where regno=?");
			ps.setInt(1,s.getRegno());
			ps.setString(2,s.getName());
			ps.setString(3,s.getGender());
			ps.setString(4,s.getFname());
			ps.setString(5,s.getMname());
			ps.setString(6,s.getDob());
			ps.setString(7,s.getState());
			ps.setString(8,s.getCity());
			ps.setString(9,s.getAddress());
			ps.setString(10,s.getContact());
			ps.setString(11,s.getEmail());
			ps.setString(12,s.getBranch());
			ps.setString(13,s.getSem());
			ps.setString(14,s.getUname());
			ps.setString(15,s.getEncpass());
			ps.setInt(16,s.getRegno());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}			
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While updating Student"+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;	
	}
	public Student getStudentByRegno(int regno)
	{
	  con=DBcon.getDBcon();
	  Student s=null;
	  try
	  {
		ps=con.prepareStatement("select * from Student_tab where regno=?");
		ps.setInt(1,regno);
		rs=ps.executeQuery();
		if(rs.next())
		{
			s=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
		}
	  }
	  catch(SQLException e)
	  {
		System.out.print("SQL Exception while searching user "+e);  
	  }
	  finally
	  {
		  DBcon.freeDBcon(con);
	  }
	  return s;
	}
	public int registerStudent(Student s)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into Student_tab values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,s.getRegno());
			ps.setString(2,s.getName());
			ps.setString(3,s.getGender());
			ps.setString(4,s.getFname());
			ps.setString(5,s.getMname());
			ps.setString(6,s.getDob());
			ps.setString(7,s.getState());
			ps.setString(8,s.getCity());
			ps.setString(9,s.getAddress());
			ps.setString(10,s.getContact());
			ps.setString(11,s.getEmail());
			ps.setString(12,s.getBranch());
			ps.setString(13,s.getSem());
			ps.setString(14,s.getUname());
			ps.setString(15,s.getEncpass());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}			
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Registering Student"+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;
	}
public int getNextRegno()
{
	con=DBcon.getDBcon();
	int y=0;
	try 
	{
	ps=con.prepareStatement("select * from student_tab order by regno");
	rs=ps.executeQuery();
	if(rs.last())
	{
		y=rs.getInt("regno")+1;
	}
	else
		y=101;	
	}
	catch(SQLException e)
	{
		System.out.print("SQL Exception While Auto Gen Reg no."+e);
	}
	finally
	{
	 DBcon.freeDBcon(con);
	}
	return y;
	}
	
}