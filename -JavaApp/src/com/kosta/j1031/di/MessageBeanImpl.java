package com.kosta.j1031.di;

public class MessageBeanImpl implements MessageBean {

	private String greeting;
	private String name;
	private Outputer out;
	
	public MessageBeanImpl() {
		System.out.println("기본 생성자");
	}

	public MessageBeanImpl(String name, Outputer out) {
		System.out.println("오버로딩 생성자");
		this.name = name;
		this.out = out;
		out.helloPrint(name);
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
		new MessageBeanImpl(name, out);
	}
}
