package com.kosta.Java0728;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest extends Frame implements ActionListener{

	Button button;
	FlowLayout flowLayout;
	int cnt;
	
	public EventTest(String title) {
		
		super(title);
		
		button = new Button("Button 1");
		flowLayout = new FlowLayout();
		
		setLayout(flowLayout);
		add(button);

		setSize(300,300);
		setVisible(true);
		
		//연결자 등록
		button.addActionListener(this);
		//this =  actionPerformed()가 구현된 위치를 명시
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("안녕");
		
		//System.exit(0);
		//0 or 양수로 정상적인 종료를 표현
		//음수 : 비정상종료를 표현
				
		setTitle("안녕 " + cnt);
		cnt++;
	}
	
	public static void main(String[] args) {
	
		new EventTest("Event Test");
	}

	
}
