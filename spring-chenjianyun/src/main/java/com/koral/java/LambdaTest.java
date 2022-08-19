package com.koral.java;

import org.springframework.util.StringUtils;

import java.net.URLPermission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/18 11:16
 */
public class LambdaTest {
	Map<String, ObjectFactory> singletonFactories = new HashMap<>();

	public static void main(String[] args) {
		LambdaTest lambdaTest = new LambdaTest();
		String beanName = "teacher";
		String a = "a";
		ArrayList<String> strings = new ArrayList<>();
		lambdaTest.singletonFactories.put("teacher", () -> lambdaTest.getEarlyObject(a, strings));
		ObjectFactory teacher = lambdaTest.singletonFactories.get("teacher");
		teacher.getBean();
	}


	

	Object getEarlyObject(String beanName, Object bean) {
		System.out.println("beanName:" + beanName + "bean:" + bean);

		return bean;
	}


}
