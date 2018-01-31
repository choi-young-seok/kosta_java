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
		
		//������ ���
		button.addActionListener(this);
		//this =  actionPerformed()�� ������ ��ġ�� ���
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("�ȳ�");
		
		//System.exit(0);
		//0 or ����� �������� ���Ḧ ǥ��
		//���� : ���������Ḧ ǥ��
				
		setTitle("�ȳ� " + cnt);
		cnt++;
	}
	
	public static void main(String[] args) {
	
		new EventTest("Event Test");
	}

	
}
