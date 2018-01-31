package com.kosta.Java0728;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.JRadioButton;


public class CheckBoxRadioButtonTest extends Frame{
	Checkbox checkbox1, checkbox2, checkbox3, checkbox4;
	CheckboxGroup checkboxGroup;
	Label label;
	TextArea area;
	JRadioButton jRadioButton1, jRadioButton2;
	
	Panel panel1, panel2;
	
	BorderLayout borderLayout;
	FlowLayout flowLayout;
	
	public CheckBoxRadioButtonTest(String title) {
		super(title);
		
		//��ü ����
		checkbox1 = new Checkbox("���", true);
		checkbox2 = new Checkbox("����", true);
//		checkbox3 = new Checkbox("����", checkboxGroup, true);
//		checkbox4 = new Checkbox("����", checkboxGroup, false);
		checkboxGroup = new CheckboxGroup();
		label = new Label("���� : ");
		area = new TextArea();
		
		panel1 = new Panel();
		panel2 = new Panel();
		
		flowLayout = new FlowLayout();
		borderLayout = new BorderLayout();
		
		//�Ӽ� ���� (frame�� �⺻ ���̾ƿ��� Border, panel�� �⺻ ���̾ƿ��� Flow
//		this.setLayout(borderLayout);
//		panel1.setLayout(flowLayout);
//		panel2.setLayout(flowLayout);
		
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.orange);
		
		add("Center", area);
		
		add("North", panel1);
			panel1.add(checkbox1);
			panel1.add(checkbox2);
		
		add("South", panel2);
			panel2.add(label);
			panel2.add(new Checkbox("����", checkboxGroup, true));
			panel2.add(new Checkbox("����", checkboxGroup, false));
	
		//������ �޼ҵ�
			setVisible(true);
			setSize(500, 500);
	}
	
	public static void main(String[] args) {
		
		new CheckBoxRadioButtonTest("CheckBox �׽�Ʈ");
	}

}
