package com.koral.spring.test;

import com.koral.spring.cycle.A;
import com.koral.spring.cycle.Logger;
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
		A bean = ctx.getBean(A.class);
		bean.buySomeThing();
		Logger bean1 = ctx.getBean(Logger.class);
		bean1.recordAfter();
	}
}
