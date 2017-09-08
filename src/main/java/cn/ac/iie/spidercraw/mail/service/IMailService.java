package cn.ac.iie.spidercraw.mail.service;

public interface IMailService {
     public void sendSimpleMail(String to,String subject,String content);
     public void sendHtmlMail(String to,String subject,String content);
     public void sendAttachmantsMail(String to,String subject,String content,String filepath);
}
