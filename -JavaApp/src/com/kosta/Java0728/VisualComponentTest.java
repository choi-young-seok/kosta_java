package com.kosta.Java0728;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.WindowEvent;

public class VisualComponentTest extends Frame{
	//0,0
	Label label;
	Scrollbar scrollbar;
	
	//0,1
	Choice choice;
	
	//1,0
	List list;
	
	//1,1
	Panel panel1, panel2, panel3, panel4, panel5, panel6, panel7;
	
	GridLayout gridLayout;
	BorderLayout borderLayout;
	WindowEvent event;
	
	public VisualComponentTest(String title) {
		super(title);
		
		//��ü����
		label = new Label("����");
		scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 200);
		//Scrollbar ( int orientation) : 0 = ����, 1 :����
		panel1 = new Panel();
		
		choice = new Choice(); //��� ��ġ�� ����
			choice.add("����");
			choice.add("����");
			choice.add("�뱸");
			choice.add("�λ�");
			choice.add("����");
			choice.add("����");
			choice.add("����");
			choice.add("����");
			choice.add("���");
			choice.add("�泲");
			
		panel2 = new Panel();
		
		list = new List(2,true); //�������� �������� ����
		//true = ���� ����
		//false = ���� ����
			list.add("�߱�");
			list.add("�౸");
			list.add("��");
			list.add("�豸");
		
		panel3 = new Panel();
		panel5 = new Panel();
		panel6 = new Panel();
		panel7 = new Panel();
		
		
		//�Ӽ�����
		this.setLayout(new GridLayout(2,2));
		panel1.setLayout(new BorderLayout(0,93));
		panel1.setBackground(Color.orange);
		panel3.setLayout(new BorderLayout());
		panel7.setBackground(Color.green);
		
		add(panel1);
			panel1.add("West",label);
			panel1.add("Center",scrollbar);
			panel1.add("South",panel5);
			panel1.add("North",panel6);
		
		add(panel2);
			panel2.add(choice);
		
		add(panel3);
			panel3.add("North",list);
			panel3.add("South",panel7);
		
		//������
		setVisible(true);
		setSize(800, 500);
	}

	public static void main(String[] args) {
		
		new VisualComponentTest("���־� ������Ʈ �׽�Ʈ");
	}

}
