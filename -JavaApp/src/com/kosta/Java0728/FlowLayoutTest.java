package com.kosta.Java0728;
import java.awt.*;

public class FlowLayoutTest {
	
	Button btn1,btn2,btn3,btn4,btn5;
	Frame frame;
	FlowLayout flowLayout;
	
	public FlowLayoutTest() {//������ : �ʱ�ȭ �޼ҵ�
		
		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		btn3 = new Button("Button 3");
		btn4 = new Button("Button 4");
		btn5 = new Button("Button 5");
		
		//Button class�� public class�̹Ƿ� ��ü ������ ��밡��
		//��ü ������ �����ڿ� label���� String���� �������� (label�� = Button�̸�)
		
		frame = new Frame("Flow layout Test");
		//Fram class�� public class�̹Ƿ� ��ü ���� �� ��� ����
		//��ü ������ �����ڿ� title���� String���� �������� (title�� = Frame ����)
		
		flowLayout =new FlowLayout();
		
		frame.setLayout(flowLayout);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) { //��� ���� �׽�Ʈ
		
		new FlowLayoutTest();
		
	}

}
