package com.kosta.Java0728;
import java.awt.*;

public class FlowLayoutTest {
	
	Button btn1,btn2,btn3,btn4,btn5;
	Frame frame;
	FlowLayout flowLayout;
	
	public FlowLayoutTest() {//생성자 : 초기화 메소드
		
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
		
		//Button class는 public class이므로 객체 생성후 사용가능
		//객체 생성시 생성자에 label값을 String으로 설정가능 (label값 = Button이름)
		
		frame = new Frame("Flow layout Test");
		//Fram class는 public class이므로 객체 생성 후 사용 가능
		//객체 생성시 생성자에 title값을 String으로 설정가능 (title값 = Frame 제목)
		
		flowLayout =new FlowLayout();
		
		frame.setLayout(flowLayout);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) { //가운데 정렬 테스트
		
		new FlowLayoutTest();
		
	}

}
