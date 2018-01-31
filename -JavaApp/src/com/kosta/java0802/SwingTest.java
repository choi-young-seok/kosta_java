package com.kosta.java0802;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest extends JFrame{
	/*
	   <Swing의 특징>
	   1. awt : 내부적으로 c언어를 통해 운영체제에서 사용하고 있는 비주얼 컴포넌트들을 사용.
	   
	   Swing : 순수 자바언어로 만들어진 컴포넌트들을 제공.
	   		   (운영체제와 상관없이 같은 모양을 보여줌)
	   		   
	   2. 패키지 : 
	   		   AWT : java.awt.*;
	   		   Swing : javax.swing.*;
	   		   ->javax : x(eXtention)확장, x(eXqution)실행
	   3. 일반적으로 awt의 컴포넌트 앞에 대문자 'J'를 붙인 클래스제공
	   		   ex) Button = JUutton
	   		   
	*/
	
	JButton button;
	
	public SwingTest(String title) {
		super(title);
		
		button = new JButton("<html><font size=10 face=궁서체 color=red>나버튼</font><br>" 
				+"<font size=10 face굴림체 color=blue>나버튼</font></html>");
		
		setLayout(new FlowLayout());
		add(button);
		
		setBounds(300,200,300,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingTest("swing Test");
	}

}
