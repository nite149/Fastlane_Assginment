package testcases;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailTestngReport {

		public static void SendEmail() throws EmailException {
		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("test-output/emailable-report.html");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("Execution Report");
		attachment.setName("Test Result");
		//Create email message
		
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("testnitesh2210@gmail.com", "selenium@123"));
		email.setSSLOnConnect(true);
		email.addTo("nite149@gmail.com", "Nitesh Chaturvedi");
		email.setFrom("testnitesh2210@gmail.com", "Me");
		email.setSubject("Execution Test Report");
		email.setMsg("Please find the test result in the attachment");
		
		//add the attacment
		email.attach(attachment);
		
		//send the email
		email.send();
	}

}
