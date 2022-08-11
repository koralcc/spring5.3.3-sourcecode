package com.koral.spring.repository;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/10 15:23
 */
public class Teacher {
	public String name;
	public Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
}
