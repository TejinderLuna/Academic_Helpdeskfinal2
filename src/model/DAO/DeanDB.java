package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Factory.DBcon;
import model.to.Dean;
import model.to.HOD;
import model.to.Placement;

public class DeanDB 
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public Dean checkDeanLogin(String type,String did,String uname,String encpass)
	{
		con=DBcon.getDBcon();
		//boolean y=false;
		Dean d=null;
		try
		{
			ps=con.prepareStatement("select dname from dean_tab where did=? and type=? and uname=? and encpass=?");
			ps.setString(1,did);
			ps.setString(2,type);
			ps.setString(3,uname);
			ps.setString(4,encpass);
			rs=ps.executeQuery();
			if(rs.next())
			{
				System.out.println("inside if rst.next");
				d=new Dean(rs.getString("dname"));	
			//y=true;
			}	
		}
		catch(SQLException e)
		{
		System.out.println("SQL Exception while checking Dean login "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		//System.out.print("after return");
		return d;
	}
	public ArrayList<Placement> getPlacementInfo()
	{
		con=DBcon.getDBcon();
		ArrayList<Placement> a=new ArrayList<Placement>();
		Placement p=null;
		try
		{
			ps=con.prepareStatement("select * from placement_tab order by srno");
			rs=ps.executeQuery();
			while(rs.next())
			{
				p=new Placement(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
				a.add(p);
			}
			
		}
		catch(SQLException e)
		{
			
		}
		finally
		{
		}
		return a;
	}
	public String getNextSerialNo()
	{
		con=DBcon.getDBcon();
		String y=null;
		int x;
		try 
		{
		ps=con.prepareStatement("select * from placement_tab order by srno");
		rs=ps.executeQuery();
		if(rs.last())
		{
			x=Integer.parseInt(rs.getString("srno"))+1;
			y=String.valueOf(x);
		}
		else
			y="1";	
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Auto Gen SERIAL NO "+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;
	}
	public int savePlacementInfo(Placement p)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into placement_tab values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,p.getSrno());
			ps.setString(2,p.getCname());
			ps.setString(3,p.getCdesc());
			ps.setString(4,p.getEligibility());
			ps.setString(5,p.getSkills());
			ps.setString(6,p.getLoc());
			ps.setString(7,p.getPost());
			ps.setString(8,p.getPkg());
			ps.setString(9,p.getNor());
			ps.setString(10,p.getRound());
			ps.setString(11,p.getDoa());
			ps.setString(12,p.getRtime());
			ps.setString(13,p.getNov());
			ps.setString(14,p.getStatus());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception while saving Placement info "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public int delHodById(String hid)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("delete from hod_tab where hid=?");
			ps.setString(1,hid);
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Deleting HOD"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public ArrayList<HOD> viewAllHod()
	{
		con=DBcon.getDBcon();
		ArrayList<HOD> a=new ArrayList<HOD>();
		HOD h=null;
		try
		{
			ps=con.prepareStatement("select * from hod_tab");
			rs=ps.executeQuery();
			while(rs.next())
			{
				h=new HOD(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
				a.add(h);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Showing HOD List "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		
		}
		return a;
	}
	
	public int updateHod(HOD h)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("update hod_tab set hid=?,hname=?,fname=?,dob=?,gender=?,hqual=?,kskills=?,hdept=?,contact=?,email=?,address=?,uname=? where hid=?");
			ps.setString(1,h.getHid());
			ps.setString(2,h.getHname());
			ps.setString(3,h.getFname());
			ps.setString(4,h.getDob());
			ps.setString(5,h.getGender());
			ps.setString(6,h.getHqual());
			ps.setString(7,h.getKskills());
			ps.setString(8,h.getHdept());
			ps.setString(9,h.getContact());
			ps.setString(10,h.getEmail());
			ps.setString(11,h.getAddress());
			ps.setString(12,h.getUname());
			ps.setString(13,h.getHid());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception while editing/updating HOD "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public HOD getHodByHid(String hid)
	{
		//System.out.print("getHodByHid()");
		con=DBcon.getDBcon();
		HOD h=null;
		try
		{
			ps=con.prepareStatement("select * from hod_tab where hid=?");
			ps.setString(1,hid);
			rs=ps.executeQuery();
			if(rs.next())
			{
				h=new HOD(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
			}
		}
		catch(SQLException e)
		{
			System.out.println("SQL exception while getting hod for updation "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return h;
	}
	public int registerHod(HOD h)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into hod_tab values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,h.getHid());
			ps.setString(2,h.getHname());
			ps.setString(3,h.getFname());
			ps.setString(4,h.getType());
			ps.setString(5,h.getDob());
			ps.setString(6,h.getGender());
			ps.setString(7,h.getHqual());
			ps.setString(8,h.getKskills());
			ps.setString(9,h.getHdept());
			ps.setString(10,h.getContact());
			ps.setString(11,h.getEmail());
			ps.setString(12,h.getAddress());
			ps.setString(13,h.getUname());
			ps.setString(14,h.getEncpass());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
		System.out.print("SQL Exception while Registering HOD"+e);	
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public int getNextHodId()
	{
		con=DBcon.getDBcon();
		int y=0;
		try 
		{
		ps=con.prepareStatement("select * from hod_tab order by hid");
		rs=ps.executeQuery();
		if(rs.last())
		{
			y=rs.getInt("hid")+3;
		}
		else
			y=100001;	
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Auto Gen Hod id."+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;
	}
}
