package com.kosta.j1031.di;

public class MessageBeanImpl implements MessageBean {

	private String greeting;
	private String name;
	private Outputer out;
	
	public MessageBeanImpl() {
		System.out.println("�⺻ ������");
	}

	public MessageBeanImpl(String name, Outputer out) {
		System.out.println("�����ε� ������");
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
