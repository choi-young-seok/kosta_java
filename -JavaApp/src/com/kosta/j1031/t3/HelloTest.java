package com.kosta.j1031.t3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("com/kosta/j1031/t3/applicationContext.xml");
		//xml�� ���ǵ� Ŭ�������� id�� �̸������� �̾Ƴ��� ����
		//�ش� ������ �����ϱ� ���ؼ��� ���ǵ� xml�� �����ϴ� ������ �ʿ�
		//ApplicationContex �������̽��� ������ GenericXmlApplicationContext Ŭ������ �����ڿ�
		//�Ķ���ͷ� ������ XML���ϸ��� ���(��Ű���� ���� ��� ��α����� "/")
		
		MessageBean msg = (MessageBean) ctx.getBean("msgBean");
		//xml������ ���ǵ� Bean�� id������ ȣ��
		msg.sayHello("�����");
	}
}
