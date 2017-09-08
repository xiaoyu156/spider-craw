package cn.ac.iie.spidercraw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpiderCrawApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(SpiderCrawApplication.class, args);
	}
}
