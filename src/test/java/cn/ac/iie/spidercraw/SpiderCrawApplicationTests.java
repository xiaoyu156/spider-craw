package cn.ac.iie.spidercraw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.ac.iie.spidercraw.base.dao.UserRepository;
import cn.ac.iie.spidercraw.mail.service.IMailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpiderCrawApplicationTests {
	
    @Autowired
    private UserRepository userRepository;
    
	@Test
	public void contextLoads() {
		
	}
    
	@Value("${spring.datasource.username}")
	String ss;
	@Test
	public void mail() throws Exception{
		System.out.println(ss);
		userRepository.findAll();
		//userRepository.saveAndFlush(new User((long) 1312312, "sds", "sdffd", "sdsd@qq.com", "", "男", 0, ""));
		//mailService.sendSimpleMail("1255947679@qq.com", "sdsdsd", "sdsd");
	}
}
