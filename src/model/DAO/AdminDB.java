package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Factory.DBcon;
import model.to.Bulletin;
import model.to.Dean;

public class AdminDB 
{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public boolean checkAdminLogin(String type,String aid,String uname,String pass)
	{
		//System.out.print(type+" "+aid+" "+uname+" "+pass);
		con=DBcon.getDBcon();
		boolean y=false;
		try
		{
			ps=con.prepareStatement("select * from admin_tab where type=? and aid=? and uname=? and pass=?");
			ps.setString(1,type);
			ps.setString(2,aid);
			ps.setString(3,uname);
			ps.setString(4,pass);
			rs=ps.executeQuery();
			//System.out.print(rs);
			if(rs.next())
			{
				System.out.print("inside rs.next for admin login");
				y=true;	
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception while checking Admin login "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public ArrayList<Bulletin> viewOnBulletinBoard()
	{
		con=DBcon.getDBcon();
		Bulletin b=null;
		ArrayList<Bulletin> a=new ArrayList<Bulletin>();
		try
		{
			ps=con.prepareStatement("select * from bulletin_tab");
			rs=ps.executeQuery();
			while(rs.next())
			{
				b=new Bulletin(rs.getString(1),rs.getString(2));
				a.add(b);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While viewing Bulletin info "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	public int deleteBulletinInfo(String srno)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("delete from bulletin_tab where srno=? ");
			ps.setString(1,srno);
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Deleting Bulletin info "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public ArrayList<Bulletin> viewAllBulletinInfo()
	{
		con=DBcon.getDBcon();
		Bulletin b=null;
		ArrayList<Bulletin> a=new ArrayList<Bulletin>();
		try
		{
			ps=con.prepareStatement("select * from bulletin_tab");
			rs=ps.executeQuery();
			while(rs.next())
			{
				b=new Bulletin(rs.getString(1),rs.getString(2));
				a.add(b);
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While viewing Bulletin info "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return a;
	}
	public int saveBulletinInfo(Bulletin b)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
			ps=con.prepareStatement("insert into bulletin_tab values(?,?)");
			ps.setString(1,b.getSrno());
			ps.setString(2,b.getInfo());
			y=ps.executeUpdate();
			if(y>0)
			{
				y=1;
			}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While saving Bulletin info"+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public String getSrNo()
	{
		con=DBcon.getDBcon();
		String y=null;
		int x;
		try 
		{
		ps=con.prepareStatement("select * from bulletin_tab order by srno");
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
	public int registerDean(Dean d)
	{
		con=DBcon.getDBcon();
		int y=0;
		try
		{
		ps=con.prepareStatement("insert into dean_tab values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,d.getDid());
		ps.setString(2,d.getDname());
		ps.setString(3,d.getFname());
		ps.setString(4,d.getType());
		ps.setString(5,d.getDob());
		ps.setString(6,d.getGender());
		ps.setString(7,d.getDqual());
		ps.setString(8,d.getExp());
		ps.setString(9,d.getContact());
		ps.setString(10,d.getEmail());
		ps.setString(11,d.getAddress());
		ps.setString(12,d.getUname());
		ps.setString(13,d.getEncpass());
		y=ps.executeUpdate();
		if(y>0)
		{
			y=1;
		}
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception while registering dean "+e);
		}
		finally
		{
			DBcon.freeDBcon(con);
		}
		return y;
	}
	public String getNextDeanId()
	{
		con=DBcon.getDBcon();
		String y=null;
		int x;
		try 
		{
		ps=con.prepareStatement("select * from dean_tab order by did");
		rs=ps.executeQuery();
		if(rs.last())
		{
			x=Integer.parseInt(rs.getString("did"))+1;
			y=String.valueOf(x);
		}
		else
			y="88231";	
		}
		catch(SQLException e)
		{
			System.out.print("SQL Exception While Auto Gen DEAN id."+e);
		}
		finally
		{
		 DBcon.freeDBcon(con);
		}
		return y;
	}
}
