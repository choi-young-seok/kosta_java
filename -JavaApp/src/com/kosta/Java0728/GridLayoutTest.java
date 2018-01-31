package com.kosta.Java0728;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutTest extends Frame{
	Button btn1,btn2,btn3,btn4,btn5;

	GridLayout gridLayout;
	
	public GridLayoutTest(String title) {
		super(title);
		//�θ��� �����ڸ� ȣ��
		//��ӽ� �θ��� private��ҿ� �����ڴ� ��ӵ��� ����
		//�ݵ�� ù�ٿ� ȣ���ؾ���
		
		//��ü ����
		btn1 = new Button("btn 1");
		btn2 = new Button("btn 2");
		btn3 = new Button("btn 3");
		btn4 = new Button("btn 4");
		btn5 = new Button("btn 5");

		//�Ӽ� ����
//		this.setLayout(new GridLayout());
//		�⺻ ������ : ���࿡ ��� component ��ġ
		
		this.setLayout(new GridLayout(2,3));
		//new GridLayout(int ��, int ��);
		//ex) new GridLayout(2,3); :2�� 3���� component ��ġ
		
		this.setLayout(new GridLayout(2,3,0,10));
		//new GridLayout(int ��, int ��, int ���򰣰�, int ��������);
		//ex )new GridLayout(2,3,0,5);
//		this.setTitle("Grid Layout Test");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
	
		
		//������ �޼ҵ�
		this.setVisible(true);
		this.setSize(500, 500);
		

	}
	
	public static void main(String[] args) {
	
		new GridLayoutTest("Grid Test");
	}
}
