package com.kosta.java0802;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseTest extends Frame{
	Button button;
	
	public MouseTest(String title) {
		super(title);
		
		button = new Button("����ư");

		
		setLayout(new FlowLayout());
		
		add(button);
		
		setBounds(300,200,300,300);
		setVisible(true);

		
		button.addMouseListener(new MouseListener() {
			//��ư ������ MouseListener���� 5�� �޼ҵ��� ������ �����ϴ� �޼ҵ� �ϳ����� ȣ��
			
			@Override
			public void mouseReleased(MouseEvent e) {
				 System.out.println("mouseReleased");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				  System.out.println("mousePressed");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				  System.out.println("mouseExited");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				 System.out.println("mouseClicked");
			}
		});
		
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
		new MouseTest("MouseTest");
		
	}

}
