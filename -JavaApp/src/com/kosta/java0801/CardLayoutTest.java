package com.kosta.java0801;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutTest  implements ActionListener{
	//객체 선언
	Button button1, button2, button3;
	Panel panel1, panel2, panel3,panel4,panel5,panel6;
//	BorderLayout borderLayout;
	CardLayout cardLayout;
	Frame frame;
	
	public CardLayoutTest(String title) {
		frame = new Frame();
		frame.setTitle(title);
		
		//객체생성
		button1 = new Button("다음");
		button2 = new Button("다음");
		button3 = new Button("다음");
		
		panel1 = new Panel(new BorderLayout(0, 10));
		panel2 = new Panel(new BorderLayout(0, 10));
		panel3 = new Panel(new BorderLayout(0, 10));
		panel4 = new Panel(new BorderLayout(0, 10));
		panel5 = new Panel(new BorderLayout(0, 10));
		panel6 = new Panel(new BorderLayout(0, 10));
		
		
		cardLayout = new CardLayout();
		
		//레이아웃 설정
		frame.setLayout(cardLayout);
		
		//배경설정
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.red);
		panel6.setBackground(Color.yellow);
		
		//속성지정
		frame.add("a1", panel1);
			panel1.add("Center",panel4);
			panel1.add("South", button1);
		
		frame.add("a2", panel2);
			panel2.add("Center",panel5);
			panel2.add("South", button2);
		
		frame.add("a3", panel3);
			panel3.add("Center",panel6);
			panel3.add("South", button3);
		
		
		//마무리 메소드

		frame.setVisible(true);
		frame.setSize(200, 300);
	
		//이벤트 연결
//		button1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				cardLayout.show(frame, "a2");
//				
//			}
//		});
//		button2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				cardLayout.show(frame, "a3");
//				
//			}
//		});
//		button3.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				cardLayout.show(frame, "a1");
//				
//			}
//		});
//		
//		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}//생성자
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getActionCommand();
		if(ob.equals("다음")){
			cardLayout.next(frame);
		}
	}
	
	public static void main(String[] args) {
		new CardLayoutTest("CardLayout Test");
	}

	
}
