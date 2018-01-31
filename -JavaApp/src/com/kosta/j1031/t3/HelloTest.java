package com.kosta.j1031.t3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("com/kosta/j1031/t3/applicationContext.xml");
		//xml에 정의된 클래스들을 id나 이름값으로 뽑아내는 과정
		//해당 과정을 진행하기 위해서는 정의된 xml을 참조하는 과정이 필요
		//ApplicationContex 인터페이스를 구현한 GenericXmlApplicationContext 클래스의 생성자에
		//파라미터로 참조할 XML파일명을 기술(패키지명 포함 모든 경로구분은 "/")
		
		MessageBean msg = (MessageBean) ctx.getBean("msgBean");
		//xml문서에 정의된 Bean의 id값으로 호출
		msg.sayHello("길라임");
	}
}
