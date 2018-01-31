package com.kosta.Java0728;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.WindowEvent;

public class VisualComponentTest extends Frame{
	//0,0
	Label label;
	Scrollbar scrollbar;
	
	//0,1
	Choice choice;
	
	//1,0
	List list;
	
	//1,1
	Panel panel1, panel2, panel3, panel4, panel5, panel6, panel7;
	
	GridLayout gridLayout;
	BorderLayout borderLayout;
	WindowEvent event;
	
	public VisualComponentTest(String title) {
		super(title);
		
		//객체생성
		label = new Label("빨강");
		scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 200);
		//Scrollbar ( int orientation) : 0 = 수평, 1 :수직
		panel1 = new Panel();
		
		choice = new Choice(); //접어서 펼치는 형태
			choice.add("서울");
			choice.add("대전");
			choice.add("대구");
			choice.add("부산");
			choice.add("강원");
			choice.add("광주");
			choice.add("전북");
			choice.add("전남");
			choice.add("충북");
			choice.add("충남");
			
		panel2 = new Panel();
		
		list = new List(2,true); //펼쳐져서 보여지는 형태
		//true = 다중 선택
		//false = 단일 선택
			list.add("야구");
			list.add("축구");
			list.add("농구");
			list.add("배구");
		
		panel3 = new Panel();
		panel5 = new Panel();
		panel6 = new Panel();
		panel7 = new Panel();
		
		
		//속성설정
		this.setLayout(new GridLayout(2,2));
		panel1.setLayout(new BorderLayout(0,93));
		panel1.setBackground(Color.orange);
		panel3.setLayout(new BorderLayout());
		panel7.setBackground(Color.green);
		
		add(panel1);
			panel1.add("West",label);
			panel1.add("Center",scrollbar);
			panel1.add("South",panel5);
			panel1.add("North",panel6);
		
		add(panel2);
			panel2.add(choice);
		
		add(panel3);
			panel3.add("North",list);
			panel3.add("South",panel7);
		
		//마무리
		setVisible(true);
		setSize(800, 500);
	}

	public static void main(String[] args) {
		
		new VisualComponentTest("비주얼 컴포넌트 테스트");
	}

}
