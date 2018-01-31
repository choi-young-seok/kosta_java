package com.kosta.java0801;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseMotionTest extends Frame implements MouseMotionListener{
	//객체 선언
	Label label1, label2;
	
	public MouseMotionTest(String title) {
		super(title);

		label1 = new Label("Move");
		label2 = new Label("Drag");
		
		label1.setBackground(Color.green);
		label2.setBackground(Color.red);
		
		label1.setLocation(50, 50);
		//붙여지는 컴포넌트가 null 레이아웃일 때 레이블의 setSIze설정이 가능
		label1.setSize(80, 50);

		label2.setBounds(50, 130, 80, 50);
		
		add(label1);
		add(label2);
		
		setLayout(null);
		
		setVisible(true);
		setSize(800,800);
		
		addMouseMotionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new MouseMotionTest("Mouse Motion Test");
	}

	
	//
		@Override
		public void mouseDragged(MouseEvent e) {
			label2.setLocation(e.getX()+2, e.getY()+2);
		}
	
		@Override
		public void mouseMoved(MouseEvent e) {
			label1.setLocation(e.getX()+2, e.getY()+2);
		}

}
