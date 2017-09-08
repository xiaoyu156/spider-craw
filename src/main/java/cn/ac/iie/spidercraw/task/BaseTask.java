package cn.ac.iie.spidercraw.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.ac.iie.spidercraw.util.DateUtil;

@Component
public class BaseTask {
	
	@Scheduled(fixedRate=6000)
	public void test() {
		System.out.println(DateUtil.getCurrentDateStr("yyyy-MM-dd HH:mm:ss"));
	}
}
