package com.koral.spring.test;

import com.koral.spring.repository.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/10 15:27
 */
public class TestBuilder {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("teacher.xml");
		Teacher bean = ctx.getBean(Teacher.class);
		System.out.println("Hello teacher,chenjianyun!");
		System.out.println(bean.getName());
	}
}
