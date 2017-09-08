package cn.ac.iie.spidercraw.mail.service.impl;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import cn.ac.iie.spidercraw.mail.service.IMailService;
@Service("mailService")
public class MailServiceImpl implements IMailService{
	private final Logger logger=Logger.getLogger(MailServiceImpl.class);
	
	@Autowired
	private JavaMailSender mailSender; 
	
    @Value("${spring.mail.from}")
    private String from;
    
	@Override
	public void sendSimpleMail(String to, String subject, String content) {
    	SimpleMailMessage message=new SimpleMailMessage();
    	message.setFrom(from);
    	message.setTo(to);
    	message.setSubject(subject);
    	message.setText(content);
    	try {
    		mailSender.send(message);
    		logger.info("-------------------------sendSimpleMail--success-----------------");
		} catch (Exception e) {
			logger.error("------------------------sendSimpleMail---failed------------------");
			e.printStackTrace();
		}
	}

	@Override
	public void sendHtmlMail(String to, String subject, String content) {
		MimeMessage message=mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper=new MimeMessageHelper(message, true);
			helper.setFrom(from);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(content);
			mailSender.send(message);
    		logger.info("-------------------------sendHtmlMail--success-----------------");
		} catch (Exception e) {
			logger.error("------------------------sendHtmlMail---failed------------------");
			e.printStackTrace();
		}
		
	}

	@Override
	public void sendAttachmantsMail(String to, String subject, String content, String filepath) {
		MimeMessage message=mailSender.createMimeMessage();
		FileSystemResource file=null;
		String fileName="";
		try {
			MimeMessageHelper helper=new MimeMessageHelper(message, true);
			helper.setFrom(from);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(content);
			file=new FileSystemResource(new File(filepath));
			fileName=filepath.substring(filepath.lastIndexOf(File.separator));
			helper.addAttachment(fileName, file);
			mailSender.send(message);
    		logger.info("-------------------------sendAttachmantsMail--success-----------------");
		} catch (Exception e) {
			logger.error("------------------------sendAttachmantsMail---failed------------------");
			e.printStackTrace();
		}
	}
    
}
