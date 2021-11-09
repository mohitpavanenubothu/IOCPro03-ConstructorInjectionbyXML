package com.springcore.ci.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.bean.WishMessageGenerator;

public class ConstrutorInjectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		String result = generator.getMsg("Mohit");
		System.out.println("Wish Message is::" + result);
		ctx.close();
	}

}
