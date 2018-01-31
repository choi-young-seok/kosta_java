package com.kosta.java0801;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BasicEventTest extends Frame implements ActionListener{
	//��ü ���� (������Ʈ, �����̳�)
	Button button1, button2;
	Panel panel1, panel2, panel3, panel4, panel5;
	GridLayout gridLayout;
//	FlowLayout flowLayout;
	int count = 0;
	
	public BasicEventTest(String title) {
		super(title);
		
		//��ü ����
		button1 = new Button("�ȳ�");
		button2 = new Button("������");
		
		//�Ӽ� ����
			//���̾ƿ�����
		setLayout(new FlowLayout()); // == FlowLayout flowlayout = new FlowLayout();�� �������� flowlayout���ε� ��������
		//setLayout(flowlayout);
			//��漳��
			//frame�� �߰�
		//�����̳�.add(������Ʈ)
		add(button1); // ==this.add(������Ʈ)
		add(button2);
		
		//api���� = Button������Ʈ���� addActionListener()�޼ҵ带 ��������
		
		//������
		setVisible(true);
		setSize(300, 300);
		
		//�̺�Ʈ�ڵ鷯 �߰�(������ ���) : �̺�Ʈ�߻� ������Ʈ.�̺�Ʈ�ڵ鷯(������Ʈ��ġ);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}//������
	
	//ActionListner �������̽��� �߻�޼ҵ� : �̺�Ʈ ó����
	@Override
	public void actionPerformed(ActionEvent e) {
		//��� ����
		//ActionEvent �Ķ����(e)���� �̺�Ʈ �ҽ��� ���۷����� ����
		//�̺�Ʈ�� �߻��� ������Ʈ�� Object�� �����ϴ� getSource()�� �̿�
		Object ob  = e.getSource();
		
		//���δٸ� ������Ʈ�� ������ �޼ҵ带 ȣ��������, 
		//�޼ҵ峻������ ���� �ٸ� ����� �����ϰ��� ������, �̸� �����ϰ��� ���
		if(ob==button1){
			count ++;
			setTitle("�ȳ�" + count);
		}
		else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new BasicEventTest("�⺻ �̺�Ʈ �׽�Ʈ");
	}



}
