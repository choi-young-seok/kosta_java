package com.kosta.java0801;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenyTest extends Frame implements ItemListener{
	GridLayout gridLayout;
	Checkbox checkbox1,checkbox2,checkbox3,checkbox4,checkbox5,checkbox6;
	CheckboxGroup checkboxGroup;
	TextArea area;
	Choice choice;
	Panel panel1,panel2,panel3;
	BorderLayout borderLayout;
	
	public MenyTest(String title) {
		super(title);
		
		//객체선언
		checkboxGroup = new CheckboxGroup();
		
		checkbox1 = new Checkbox("아침", true, checkboxGroup);
		checkbox2 = new Checkbox("점심", false, checkboxGroup);
		checkbox3 = new Checkbox("저녁", false, checkboxGroup);
		
		checkbox4 = new Checkbox("돼지바", false);
		checkbox5 = new Checkbox("수박바", false);
		checkbox6 = new Checkbox("보석바", false);
		
	
		area = new TextArea();
		
		choice = new Choice();
			choice.add("아침");
			choice.add("점심");
			choice.add("저녁");
		
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		
		borderLayout = new BorderLayout();

		//레이아웃 지정

		setLayout(borderLayout);
		
		panel1.setLayout(new GridLayout(0, 3));
		panel3.setLayout(new FlowLayout());
		//배경설정
		panel1.setBackground(Color.orange);
		panel3.setBackground(Color.pink);
		
		
		//속성설정
		add("North",panel1);
			panel1.add(checkbox1);
			panel1.add(checkbox2);
			panel1.add(checkbox3);
			
			panel1.add(checkbox4);
			panel1.add(checkbox5);
			panel1.add(checkbox6);
			
		add("Center",panel2);
			panel2.add(area);
			
		add("South",panel3);
			panel3.add(choice);
			
		//마무리
		setSize(300, 300);
		setVisible(true);
		
		//이벤트연결
		
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		
		checkbox4.addItemListener(this);
		checkbox5.addItemListener(this);
		checkbox6.addItemListener(this);
		
		choice.addItemListener(this);
	
	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
	}//생성자
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		Checkbox checkbox = checkboxGroup.getSelectedCheckbox();
		
		Object ob = e.getItem();
		//->choice에 add된 item의 String을 반환
		area.setText("\t\t***" +checkbox.getLabel() + "***\n");
		
		if(ob.equals(checkbox1.getLabel())){
			checkboxGroup.setSelectedCheckbox(checkbox1);
			choice.select(checkbox1.getLabel());
			System.out.println("ob : "+ob);
			System.out.println(" checkbox1.getLabel : "+ checkbox1.getLabel());
			System.out.println("checkbox.getLabel : "+checkbox.getLabel());
			System.out.println();
			
		}
		
		else if (ob.equals(checkbox2.getLabel())){
			checkboxGroup.setSelectedCheckbox(checkbox2);
			choice.select(checkbox2.getLabel());	
			System.out.println(ob);
			System.out.println(checkbox2.getLabel());
			System.out.println(checkbox.getLabel());
			System.out.println();

		}
		
		else if (ob.equals(checkbox3.getLabel())){
			checkboxGroup.setSelectedCheckbox(checkbox3);
			choice.select(checkbox3.getLabel());
			System.out.println(ob);
			System.out.println(checkbox2.getLabel());
			System.out.println(checkbox.getLabel());
			System.out.println();

		}
		
			area.append("\t\t1." +checkbox4.getLabel()+  ":" +checkbox4.getState() + "\n");
			area.append("\t\t2." +checkbox5.getLabel()+  ":" +checkbox5.getState() + "\n");	
			area.append("\t\t3." +checkbox6.getLabel()+  ":" +checkbox6.getState() + "\n");	
	}
	
	public static void main(String[] args) {
		new MenyTest("메뉴 출력");
	}


	
	
}
