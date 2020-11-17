package com.techlab.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RegisterFormService {
	String from="clashing32@gmail.com";
	String password="epicclashing";
	public boolean sendEmail(String firstName,String lastName,String to,String age) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.starttls.enable", "true");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setText("Hello "+firstName+" "+lastName+" you are registered!!");
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("registration app test(from pawan chhabria)");
			Transport.send(message);
			return true;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
		
	}

}
