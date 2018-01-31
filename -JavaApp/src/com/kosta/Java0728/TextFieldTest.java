package com.kosta.Java0728;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class TextFieldTest extends Frame{
	//��ü ����
	TextField field1, field2;
	TextArea area;
	Label label;
	Panel panel1, panel2;
	
	BorderLayout borderLayout;
	FlowLayout flowLayout;
	
	public TextFieldTest(String title) {
		super(title);
		
		//��ü ����
		panel1 = new Panel();
		field1 = new TextField(15);
		
		panel2 = new Panel();
		field2 = new TextField(15);
		label = new Label("�����̸� : ");
		
		area = new TextArea();
		
		borderLayout = new BorderLayout();
		flowLayout = new FlowLayout();
		
		//��ü �Ӽ� ����
		this.setLayout(borderLayout);
		panel1.setLayout(flowLayout);
		panel2.setLayout(flowLayout);
		
		panel1.setBackground(Color.green);
		panel2.setBackground(Color.yellow);	
		panel2.setForeground(Color.red);
		
		//��ü ���̱�
		add("North",panel1);
			panel1.add(field1);
		
		add("South",panel2);
			panel2.add(label);
			panel2.add(field2);
		
		add("Center",area);

		//������ �޼ҵ�
		this.setVisible(true);
		this.setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new TextFieldTest("TextFieldArea �׽�Ʈ");
	}

}
