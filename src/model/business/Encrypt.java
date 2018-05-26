package model.business;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt
{
 public static String getEncryptedPassword(String p)
 {
	MessageDigest md=null;
	try
	{
		md=MessageDigest.getInstance("SHA-1");
	}
	catch(NoSuchAlgorithmException e)
	{
		e.printStackTrace();
	}
	md.update(p.getBytes(),0,p.length());
	BigInteger bobj=new BigInteger(1,md.digest());
	String ep=bobj.toString(16);
	return ep;
 }
	
	
	
}
