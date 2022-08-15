package com.koral.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/10 15:27
 */
public class TestBuilder  {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("teacher.xml");
		for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
	}
}
