package com.koral.spring.test;

import com.koral.spring.cycle.Buyer;
import com.koral.spring.repository.Teacher;
import org.springframework.aop.support.AopUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/10 15:27
 */
public class TestCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("cycle.xml");
	}
}
