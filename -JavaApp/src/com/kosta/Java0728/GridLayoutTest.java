package com.kosta.Java0728;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutTest extends Frame{
	Button btn1,btn2,btn3,btn4,btn5;

	GridLayout gridLayout;
	
	public GridLayoutTest(String title) {
		super(title);
		//부모의 생성자를 호출
		//상속시 부모의 private요소와 생성자는 상속되지 않음
		//반드시 첫줄에 호출해야함
		
		//객체 생성
		btn1 = new Button("btn 1");
		btn2 = new Button("btn 2");
		btn3 = new Button("btn 3");
		btn4 = new Button("btn 4");
		btn5 = new Button("btn 5");

		//속성 설정
//		this.setLayout(new GridLayout());
//		기본 생성자 : 한행에 모든 component 배치
		
		this.setLayout(new GridLayout(2,3));
		//new GridLayout(int 행, int 열);
		//ex) new GridLayout(2,3); :2행 3열로 component 배치
		
		this.setLayout(new GridLayout(2,3,0,10));
		//new GridLayout(int 행, int 열, int 수평간격, int 수직간격);
		//ex )new GridLayout(2,3,0,5);
//		this.setTitle("Grid Layout Test");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
	
		
		//마무리 메소드
		this.setVisible(true);
		this.setSize(500, 500);
		

	}
	
	public static void main(String[] args) {
	
		new GridLayoutTest("Grid Test");
	}
}
