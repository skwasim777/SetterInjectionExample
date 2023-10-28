package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("setter.xml");
		Question q = (Question) app.getBean("que");
		q.desplay();
	}
}
