package com.koral.spring.test;

import com.koral.spring.config.CjyConfig;
import com.koral.spring.repository.Hello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/10 12:10
 */
public class TestHelloBean {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CjyConfig.class);
		Hello bean = ctx.getBean(Hello.class);
		bean.hello();
		System.out.println("*************************");

	}
}
