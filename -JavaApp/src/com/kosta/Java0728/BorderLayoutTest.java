package com.kosta.Java0728;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {
	//사용할 객체 선언;
	Button btn1,btn2,btn3,btn4,btn5;
	Frame frame;
	BorderLayoutTest borderLayoutTest;
	
	public BorderLayoutTest() {
		//객체 생성
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
		
		frame = new Frame("Border Layout Test");
		
		//객체 속성 설정
		
		frame.setLayout(new BorderLayout());
		
		frame.add("North" , btn1);
		frame.add("East" , btn2);
		frame.add("South" , btn3);
		frame.add("West" , btn4);
		frame.add("Center" , btn5);
		//add(String 방향, 객체변수명)
		//방향설정 -> String으로 ""내에 첫글자는 대문자로 표기
		
		//마모레 메소드 호출 (컨테이너 사이즈, 컨테이너 보이기 설정)
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		
	}
	
	public static void main(String[] args) {
		
		new BorderLayoutTest();
		
	}

}
