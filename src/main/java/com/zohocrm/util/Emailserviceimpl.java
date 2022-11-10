package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class Emailserviceimpl implements Emailservice {
@Autowired
private JavaMailSender JavaMailSender;

	@Override
	public void sendSimpleMail(String to, String sub, String email) {
		 SimpleMailMessage mailmessage = new SimpleMailMessage();
	mailmessage.setTo(to);
	mailmessage.setSubject(sub);
	mailmessage.setText(email);
	
	JavaMailSender.send(mailmessage);
	}

}
