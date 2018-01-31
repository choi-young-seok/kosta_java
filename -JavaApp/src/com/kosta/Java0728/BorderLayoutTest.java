package com.kosta.Java0728;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {
	//����� ��ü ����;
	Button btn1,btn2,btn3,btn4,btn5;
	Frame frame;
	BorderLayoutTest borderLayoutTest;
	
	public BorderLayoutTest() {
		//��ü ����
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
		
		frame = new Frame("Border Layout Test");
		
		//��ü �Ӽ� ����
		
		frame.setLayout(new BorderLayout());
		
		frame.add("North" , btn1);
		frame.add("East" , btn2);
		frame.add("South" , btn3);
		frame.add("West" , btn4);
		frame.add("Center" , btn5);
		//add(String ����, ��ü������)
		//���⼳�� -> String���� ""���� ù���ڴ� �빮�ڷ� ǥ��
		
		//���� �޼ҵ� ȣ�� (�����̳� ������, �����̳� ���̱� ����)
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		
	}
	
	public static void main(String[] args) {
		
		new BorderLayoutTest();
		
	}

}
