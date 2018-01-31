package com.kosta.j1031.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("com/kosta/j1031/di/applicationContext.xml");

		// MessageBean msg = (MessageBean) ctx.getBean("msgBean");
		MessageBean msg = ctx.getBean("msgBean", MessageBean.class);
		// MessageBean output = (MessageBean) ctx.getBean("output");
//		Outputer output = (Outputer) ctx.getBean("fileOutput");

		msg.sayHello();
	}

}
