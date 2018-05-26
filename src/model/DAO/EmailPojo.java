package model.DAO;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailPojo 
{
	public void regEmail(String name,String id,String uname,String pass,String email)
	{
		System.out.print("Register Email : "+name+" "+id+" "+uname+" "+pass+" "+email);
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
		{
			protected PasswordAuthentication getPasswordAuthentication() 
				{
					return new PasswordAuthentication("kesarmanpreet@gmail.com","@mygmail");
				}
		});

		try 
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("kesarmanpreet@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
			message.setSubject("Verification Mail");
			message.setText("Dear user : "+name+"\n\n\n You are succesfully REGISTERED with AcademicHelpdesk.com following are your details\n\n" +
					        "User id : "+id+"\n\n Username is : "+uname+"\n\n Password is : "+pass+"\n\n\n" +
							"Please use above details for logging into your ACCOUNT & enjoying our services\n\n" +
							"Regards AcademicHelpdesk.com");

			Transport.send(message);
			
			System.out.println("Done sending register mail");
			
		} 
		catch (MessagingException e) 
		{
			System.out.print("Mail Not Send : "+e);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public boolean sendEmail(String uname,String from,String email,String query)
	{
		System.out.print(uname+" "+from+" "+email+" "+query);
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		boolean f=true;
		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
		{
			protected PasswordAuthentication getPasswordAuthentication() 
				{
					return new PasswordAuthentication("kesarmanpreet@gmail.com","@mygmail");
				}
		});

		try 
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("kesarmanpreet@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));
			message.setSubject("Query Email");
			message.setText("Dear user!\n\n\n There is Query from User : "+uname+"\n\n His EMAIL address is:"+from+" \n\n QUERY IS : "+query+"\n\n\n " +
					"NOTICE :if you want to reply,reply to this Email address:"+from+"\n\n Regards AcademicHelpdesk.com,DAVIET");

			Transport.send(message);
			
			System.out.println("Done");
			
		} 
		catch (MessagingException e) 
		{
			System.out.print("Mail Not Send : "+e);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return f;
	}
}
