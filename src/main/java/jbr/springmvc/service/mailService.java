package jbr.springmvc.service;


import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.activation.DataSource;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

public class mailService {

    private String to;
    private String from;

    private String subject;
    private String body;
    private String attachmentPath;

    //provide Mailtrap's username
    private String username;
    //provide Mailtrap's password
    private String password;
    private String host;
    private Properties properties;
    private Session session;

    public mailService(String username, String password, String host) {
        this.username = username;
        this.password = password;
        this.host = host;
        setProperties();
        setSession();
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public String getBody() {
        return body;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }

    public Properties getProperties() {
        return properties;
    }

    public Session getSession() {
        return session;
    }



    protected void setTo(String to) {
        this.to = to;
    }

    protected void setFrom(String from) {
        this.from = from;
    }

    protected void setSubject(String subject) {
        this.subject = subject;
    }

    protected void setBody(String body) {
        this.body = body;
    }

    protected void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected void setHost(String host) {
        this.host = host;
    }

    protected void setProperties() {
        this.properties = new Properties();
        this.properties.put("mail.smtp.auth", "true");
        this.properties.put("mail.smtp.starttls.enable", "true");
        this.properties.put("mail.smtp.host", host);
        this.properties.put("mail.smtp.port", "587");
    }

    protected void setSession() {
        //create the Session object
        this.session = Session.getInstance(this.properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(getUsername(), getPassword());
                    }
                });

    }

    public void sendTextMail(String to, String from, String subject, String body) {

        setTo(to);
        setFrom(from);
        setSubject(subject);
        setBody(body);

        try {
            //create a MimeMessage object
            Message message = new MimeMessage(this.session);

            //set From email field
            message.setFrom(new InternetAddress(this.from));

            //set To email field
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(this.to));

            //set email subject field
            message.setSubject(this.subject);

            //set the content of the email message
            message.setText(this.body);

            //send the email message
            Transport.send(message);

            System.out.println("Email Message Sent Successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendHTMLMail(String to, String from, String subject, String body) {

        setTo(to);
        setFrom(from);
        setSubject(subject);
        setBody(body);

        try {
            //create a MimeMessage object
            Message message = new MimeMessage(this.session);

            //set From email field
            message.setFrom(new InternetAddress(this.from));

            //set To email field
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(this.to));

            //set email subject field
            message.setSubject(this.subject);

            //set the content of the email message
            message.setContent(this.body,"text/html");

            //send the email message
            Transport.send(message);

            System.out.println("Email Message Sent Successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    public void sendAttachmentMail(String to, String from, String subject, String body, String attachmentPath){

        setTo(to);
        setFrom(from);
        setSubject(subject);
        setBody(body);
        setAttachmentPath(attachmentPath);

        try {
            //create a MimeMessage object
            Message message = new MimeMessage(this.session);

            //set From email field
            message.setFrom(new InternetAddress(this.from));

            //set To email field
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(this.to));

            //set email subject field
            message.setSubject(this.subject);

            //create the message body part
            BodyPart messageBodyPart = new MimeBodyPart();

            //set the actual message
            messageBodyPart.setText(this.body);

            //create an instance of multipart object
            Multipart multipart = new MimeMultipart();

            //set the first text message part
            multipart.addBodyPart(messageBodyPart);

            //set the second part, which is the attachment
            messageBodyPart = new MimeBodyPart();
            //String filename = "C:\\Users\\OPIDI\\Desktop\\File 1\\gantt2.png";
            DataSource source = new FileDataSource(this.attachmentPath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(this.attachmentPath);
            multipart.addBodyPart(messageBodyPart);

            //send the entire message parts
            message.setContent(multipart);

            //send the email message
            Transport.send(message);

            System.out.println("Email Message Sent Successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


}

