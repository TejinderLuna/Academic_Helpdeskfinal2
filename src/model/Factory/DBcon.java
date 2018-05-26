package model.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon
{
static String url="jdbc:mysql://localhost:3306/academichelpdesk";
static String user="root";
static String pass="1234";
static Connection con;
public static Connection getDBcon()
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,user,pass);
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("Class exception while saving employe "+e);
	}
	catch(SQLException e)
	{
		System.out.println("SQL exception while saving employe "+e);
	}
	return con;
}
public static void freeDBcon(Connection con)
{
	try
	{
		con.close();
	}
	catch(Exception e)
	{
		System.out.println("exception while closing DBcon connection"+e);
	}
}
}

