package com.kosta.java0801;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BasicEventTest extends Frame implements ActionListener{
	//객체 선언 (컴포넌트, 컨테이너)
	Button button1, button2;
	Panel panel1, panel2, panel3, panel4, panel5;
	GridLayout gridLayout;
//	FlowLayout flowLayout;
	int count = 0;
	
	public BasicEventTest(String title) {
		super(title);
		
		//객체 생성
		button1 = new Button("안녕");
		button2 = new Button("나가기");
		
		//속성 설정
			//레이아웃설정
		setLayout(new FlowLayout()); // == FlowLayout flowlayout = new FlowLayout();의 참조변수 flowlayout으로도 설정가능
		//setLayout(flowlayout);
			//배경설정
			//frame에 추가
		//컨테이너.add(컴포넌트)
		add(button1); // ==this.add(컴포넌트)
		add(button2);
		
		//api참조 = Button컴포넌트에는 addActionListener()메소드를 구현가능
		
		//마무리
		setVisible(true);
		setSize(300, 300);
		
		//이벤트핸들러 추가(연결자 등록) : 이벤트발생 컴포넌트.이벤트핸들러(컴포넌트위치);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}//생성자
	
	//ActionListner 인터페이스의 추상메소드 : 이벤트 처리부
	@Override
	public void actionPerformed(ActionEvent e) {
		//기능 정의
		//ActionEvent 파라미터(e)에는 이벤트 소스의 레퍼런스가 전달
		//이벤트가 발생한 컴포넌트를 Object로 리턴하는 getSource()를 이용
		Object ob  = e.getSource();
		
		//서로다른 컴포넌트가 동일한 메소드를 호출하지만, 
		//메소드내에서는 서로 다른 기능을 구현하고자 했을때, 이를 구분하고자 사용
		if(ob==button1){
			count ++;
			setTitle("안녕" + count);
		}
		else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new BasicEventTest("기본 이벤트 테스트");
	}



}
