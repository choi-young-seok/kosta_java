package com.kosta.java0802;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class JRadioTest extends JFrame {
	JRadioButton button1, button2, button3;
	JPanel jPanel;
	
	public JRadioTest(String title) {
		super(title);
		
		ImageIcon icon1 = new ImageIcon("kosta_image/left.gif");
		ImageIcon icon2 = new ImageIcon("kosta_image/leftrollover.gif");
		ImageIcon icon3 = new ImageIcon("kosta_image/leftdown.gif");
		
		ImageIcon icon4 = new ImageIcon("kosta_image/right.gif");
		ImageIcon icon5 = new ImageIcon("kosta_image/rightrollover.gif");
		ImageIcon icon6 = new ImageIcon("kosta_image/rightdown.gif");
		
		button1 = new JRadioButton("1",icon1);
			button1.setToolTipText("첫번째");
			button1.setRolloverIcon(icon2);
			button1.setPressedIcon(icon3);
		button2 = new JRadioButton("2",icon4);
			button2.setToolTipText("두번째");
			button2.setRolloverIcon(icon5);
			button2.setPressedIcon(icon6);
		
		button3 = new JRadioButton("3");
			button3.setToolTipText("세번째");
		
		ButtonGroup buttonGroup = new ButtonGroup();
			buttonGroup.add(button1);
			buttonGroup.add(button2);
			buttonGroup.add(button3);

		jPanel = new JPanel();
		jPanel.setBorder(new TitledBorder(new BevelBorder(1),"라디오그룹"));
		
		jPanel.setLayout(new GridLayout(3, 0));
			jPanel.add(button1);
			jPanel.add(button2);
			jPanel.add(button3);
			
		add(jPanel);
			
		setVisible(true);
		setBounds(300, 200, 300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JRadioTest("JRadio Test");
	}

}
