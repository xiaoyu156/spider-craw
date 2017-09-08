/*package cn.ac.iie.spidercraw.shiro.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
	private static final Logger logger=Logger.getLogger(ShiroConfig.class);
	@Bean
	public ShiroFilterFactoryBean shiroFilter(org.apache.shiro.mgt.SecurityManager securityManager) {
		logger.info("--------------ShiroConfig shiroFilter");
		ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		//拦截器
		Map<String, String> filterChainDefinitionMap=new LinkedHashMap<>();
		//配置不会呗拦截的链接，顺序判断
		filterChainDefinitionMap.put("/static/**", "anon");
		//配置退出过滤器，具体代码shiro已经替我们实现了
		filterChainDefinitionMap.put("/logout", "logout");
		//过滤链定义，从上向下的顺序执行，一般将/**放在最为下边
		//authc :过滤所有的url都必须通过认证才可以访问
		filterChainDefinitionMap.put("/**", "authc");
		//如果不设置默认会自动寻找web根目录下的login.jsp
		shiroFilterFactoryBean.setLoginUrl("/login");
		//未授权界面
		shiroFilterFactoryBean.setUnauthorizedUrl("/403");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilterFactoryBean;
	}
	
//	@Bean
//	public MyShiroRealm myShiroRealm() {
//		return null;
//	}
}
*/