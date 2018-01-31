package com.kosta.Java0728;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class TextFieldTest extends Frame{
	//객체 선언
	TextField field1, field2;
	TextArea area;
	Label label;
	Panel panel1, panel2;
	
	BorderLayout borderLayout;
	FlowLayout flowLayout;
	
	public TextFieldTest(String title) {
		super(title);
		
		//객체 생성
		panel1 = new Panel();
		field1 = new TextField(15);
		
		panel2 = new Panel();
		field2 = new TextField(15);
		label = new Label("파일이름 : ");
		
		area = new TextArea();
		
		borderLayout = new BorderLayout();
		flowLayout = new FlowLayout();
		
		//객체 속성 지정
		this.setLayout(borderLayout);
		panel1.setLayout(flowLayout);
		panel2.setLayout(flowLayout);
		
		panel1.setBackground(Color.green);
		panel2.setBackground(Color.yellow);	
		panel2.setForeground(Color.red);
		
		//객체 붙이기
		add("North",panel1);
			panel1.add(field1);
		
		add("South",panel2);
			panel2.add(label);
			panel2.add(field2);
		
		add("Center",area);

		//마무리 메소드
		this.setVisible(true);
		this.setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new TextFieldTest("TextFieldArea 테스트");
	}

}
