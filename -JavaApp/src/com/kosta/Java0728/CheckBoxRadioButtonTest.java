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
		
		//객체 생성
		checkbox1 = new Checkbox("사과", true);
		checkbox2 = new Checkbox("딸기", true);
//		checkbox3 = new Checkbox("남자", checkboxGroup, true);
//		checkbox4 = new Checkbox("여자", checkboxGroup, false);
		checkboxGroup = new CheckboxGroup();
		label = new Label("성별 : ");
		area = new TextArea();
		
		panel1 = new Panel();
		panel2 = new Panel();
		
		flowLayout = new FlowLayout();
		borderLayout = new BorderLayout();
		
		//속성 지정 (frame의 기본 레이아웃은 Border, panel의 기본 레이아웃은 Flow
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
			panel2.add(new Checkbox("남자", checkboxGroup, true));
			panel2.add(new Checkbox("여자", checkboxGroup, false));
	
		//마무리 메소드
			setVisible(true);
			setSize(500, 500);
	}
	
	public static void main(String[] args) {
		
		new CheckBoxRadioButtonTest("CheckBox 테스트");
	}

}
