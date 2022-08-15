package com.koral.spring.extennds;

import java.lang.reflect.Field;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/14 22:26
 */
public class TestMain {
	public static void main(String[] args) {
		Son son = new Son();
		son.setParentA("hello");
		System.out.println(son.getParentA());
		//子类会继承父类的所有私有变量和方法，只是没有直接访问的权限
		Class<Son> sonClass = Son.class;
		for (Field declaredField : sonClass.getDeclaredFields()) {
			System.out.println(declaredField);
		}
	}
}
