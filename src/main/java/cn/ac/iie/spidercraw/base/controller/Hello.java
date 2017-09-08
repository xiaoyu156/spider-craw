package cn.ac.iie.spidercraw.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ac.iie.spidercraw.base.dao.UserRepository;
import cn.ac.iie.spidercraw.base.domain.UserInfo;

@RestController(value="hello")
public class Hello {
   @Autowired
   private UserRepository userRepository;
   
   @RequestMapping(value="/hello")
   public String hello() {
   userRepository.findAll();
	   return "hello";
   }
   
   @RequestMapping(value="/insert")
   public String insert() {
	   UserInfo user=new UserInfo();
	   userRepository.save(user);
	   System.out.println(userRepository.findAll());;
	   return "insert";
   }
   
}
