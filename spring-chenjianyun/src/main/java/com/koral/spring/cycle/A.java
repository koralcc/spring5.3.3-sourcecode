package com.koral.spring.cycle;

/**
 * spring
 *
 * @author koral
 * @date 2022/8/13 23:24
 */
public class A {
	private String name;
	private B b;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void buySomeThing(){
		System.out.println("买了雪糕");
	}

}
