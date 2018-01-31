package com.kosta.j1031.t2;

public class MessageBeanKo implements MessageBean {
	//interface MessageBean을 상속받았으므로 반드시 해당 인터페이스에서
	//제공하는 메소드를 구현
	@Override
	public void sayHello(String name) {
		System.out.println("안녕, "+name);

	}

}
