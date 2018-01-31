package com.kosta.java0802;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class JCheckBoxTest extends JFrame{
	JCheckBox box1, box2, box3;
	JPanel jPanel;
	
	
	public JCheckBoxTest(String title) {
		super(title);
		ImageIcon icon1 = new ImageIcon("kosta_image/LEFT.GIF");
		ImageIcon icon2 = new ImageIcon("kosta_image/leftrollover.gif");
		ImageIcon icon3 = new ImageIcon("kosta_image/leftdown.gif");
		
		box1 = new JCheckBox("ù��° üũ�ڽ�",icon1);
//			box1.setRolloverIcon(new ImageIcon("kosta_image/));
		box2 = new JCheckBox("�ι�° üũ�ڽ�",icon2);
		box3 = new JCheckBox("����° üũ�ڽ�",icon3);

		jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(3, 0));

			jPanel.add(box1);
			jPanel.add(box2);
			jPanel.add(box3);
			
			//�г��� �׵θ� ����
			jPanel.setBorder(new TitledBorder(new BevelBorder(0),"�׵θ�Ÿ��Ʋ"));
//			jPanel.setBorder(new BevelBorder(1, Color.black, Color.white));
//			jPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
//			jPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));

			
		
		add(jPanel);
		
		setVisible(true);
		setBounds(300,200,300,300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JCheckBoxTest("JCheckBox Test");
	}

}
