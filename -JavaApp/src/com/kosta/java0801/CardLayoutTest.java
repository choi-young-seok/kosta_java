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
	//��ü ����
	Button button1, button2, button3;
	Panel panel1, panel2, panel3,panel4,panel5,panel6;
//	BorderLayout borderLayout;
	CardLayout cardLayout;
	Frame frame;
	
	public CardLayoutTest(String title) {
		frame = new Frame();
		frame.setTitle(title);
		
		//��ü����
		button1 = new Button("����");
		button2 = new Button("����");
		button3 = new Button("����");
		
		panel1 = new Panel(new BorderLayout(0, 10));
		panel2 = new Panel(new BorderLayout(0, 10));
		panel3 = new Panel(new BorderLayout(0, 10));
		panel4 = new Panel(new BorderLayout(0, 10));
		panel5 = new Panel(new BorderLayout(0, 10));
		panel6 = new Panel(new BorderLayout(0, 10));
		
		
		cardLayout = new CardLayout();
		
		//���̾ƿ� ����
		frame.setLayout(cardLayout);
		
		//��漳��
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.red);
		panel6.setBackground(Color.yellow);
		
		//�Ӽ�����
		frame.add("a1", panel1);
			panel1.add("Center",panel4);
			panel1.add("South", button1);
		
		frame.add("a2", panel2);
			panel2.add("Center",panel5);
			panel2.add("South", button2);
		
		frame.add("a3", panel3);
			panel3.add("Center",panel6);
			panel3.add("South", button3);
		
		
		//������ �޼ҵ�

		frame.setVisible(true);
		frame.setSize(200, 300);
	
		//�̺�Ʈ ����
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
	}//������
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getActionCommand();
		if(ob.equals("����")){
			cardLayout.next(frame);
		}
	}
	
	public static void main(String[] args) {
		new CardLayoutTest("CardLayout Test");
	}

	
}
