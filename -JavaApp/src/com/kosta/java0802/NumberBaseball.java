package com.kosta.java0802;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class NumberBaseball extends JFrame implements ActionListener{
	
	JPanel panel, panel2, panel3;
	TextField field;
	TextArea area;
	JButton button1, button2, button3, button4;
	JScrollPane jScrollPane;
	Label label;
	Dialog dialog;
	Random random;
	int RanNum[] = new int [10];
	int toIntArray[] = new int[3];
	String inputNum;
	int cnt = 0;
	int start = 0;
	int S = 0, B = 0;
	boolean b = true;
	JOptionPane jOptionPane;
	
//�迭 �ʱ�ȭ �޼ҵ�
	public void arrayInit(){
		for (int i = 0; i < RanNum.length; i++) {
			RanNum[i] = i;
		}
	}
//�����߻� �޼ҵ�
	public void shakeNum(){
		int temp;
		for (int i = 0; i < 10000; i++) {
			int shake = random.nextInt(10);
			temp = RanNum[0];
			RanNum[0] = RanNum[shake];
			RanNum[shake] = temp;
		}//for
	}
//���� ��ġ �˻� �޼ҵ�
	public void checkNum(){
		S=0; B=0;
		for (int i = 0; i < toIntArray.length; i++) {
			for (int j = 0; j < 3; j++) {
				if(toIntArray[i]==RanNum[j]){
					if(i==j){
//						System.out.println("toIntArray["+i+"] : " +toIntArray[i]+"\tRanNum["+j+"] : "+RanNum[j]+"\t\tS : "+S);
						S++;
					}
					else{
//						System.out.println("toIntArray["+i+"] : " +toIntArray[i]+"\tRanNum["+j+"] : "+RanNum[j]+"\t\tB : "+B);
						B++;
					}
				}//if
			}//inner for
		}//outer for
		area.append("\tS: "+S+"  B: "+B+"\n");
	}
	
//Ƚ���� ���� ��Ʈ ��� �޼ҵ�
	public void printMent(){
		if(S==3){
			if(cnt<5){
				area.append("\t\t\t��� �̻� �Դϴ�. \n");
				area.append("\t\t\t�����մϴ�. �����Դϴ�. �� Ƚ�� : "+(cnt+1)+"\n\t\t\t---------------------------------\n");
				start=0;
			}
			else{
				area.append("\t\t\t���� �� ����ϼ��� ~!! \n");
				area.append("\t\t\t�����մϴ�. �����Դϴ�. �� Ƚ�� : "+(cnt+1)+"\n\t\t\t---------------------------------\n");
				start=0;
			}
		}
		
	}
//feild.getText�� String���� int�� �迭�� ��ȯ �޼ҵ�
	public void toIntArray(String input){
		String inputNumArray[]=input.split("");
		for (int i = 0; i < inputNumArray.length; i++) {
			toIntArray[i]=Integer.parseInt(inputNumArray[i]);
		}
	}
//����Ƚ�� �ʱ�ȭ �޼ҵ�
	public void initCnt(){
		cnt = 0;
	}
//NumberFormatExceptionó���Ұ� + (����˻�,���ڰ˻�,���̰˻�)
	public boolean regexp (String input){
		if(input.equals("")){
			JOptionPane.showMessageDialog(this, "������ �Է� �� �� �����ϴ�!");
//			area.setText("������ �Է��Ҽ� �����ϴ�.\n");
			b=false;
			return b;
		}
		else if(input.length()!=3){
			try {
				if(!input.matches("[0-9]{3}")){ //[\\d] = [0-9]
					JOptionPane.showMessageDialog(this, "���ڸ� �Է��ϼ���!");
//					area.append("\t\t\t\t���ڸ� �Է��ϼ���!\n");
					field.setText("");
					b=false;
					return b;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "3�ڸ� ���ڸ� �Է��ϼ���!");
//			area.append("\t\t\t\t3�ڸ� ���ڸ� �Է��ϼ���!\n");
			field.setText("");
		}
		else{
			b=true;
		}
		return b;
	}
	
	public NumberBaseball(String title) {
		super(title);
		random = new Random();
		jOptionPane = new JOptionPane();
		
		arrayInit();
		button1 = new JButton("������");
		//random�� �̿��Ͽ� 3���� ���� �Ȱ�ġ�� ���
		button2 = new JButton("�����");
		//text�ʵ�� area �����
		button3 = new JButton("����");
		//���� ���
		button4 = new JButton("������");
		//System.exit(0)
		
		area = new TextArea();
			area.setEditable(false);
//			area.setEnabled(false);
		area.isBackgroundSet();
		jScrollPane = new JScrollPane(area);
			
		field = new TextField(45);
		label = new Label("�Է� : ");
		
		panel= new JPanel();
			panel.setBackground(Color.orange);
			panel.setLayout(new GridLayout(0, 1, 0, 120));
			panel.add(button1);
			panel.add(button2);
			panel.add(button3);
			panel.add(button4);		
		
		panel3 = new JPanel();
			panel3.setLayout(new FlowLayout());
			panel3.add(label);
			panel3.add(field);
		
		panel2 = new JPanel();
			panel2.setLayout(new BorderLayout());
			panel2.add("Center",area);
			panel2.add("South",panel3);

		setLayout(new BorderLayout());
		add("Center",panel2);
		add("East",panel);

		setBackground(Color.orange);
			
		setVisible(true);
		setBounds(300, 200, 600, 600);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){

					if(regexp(field.getText()))
					{
						toIntArray(field.getText());
						area.append("\t\t\t�Է� ���� : "+field.getText()+"\t"+(cnt+1)+"ȸ :  ");
						checkNum();
						field.setText(null);
						printMent();
						cnt++;
					}
//					field.setText("");
				}//if
			}//keyPressed
		});//KeyListener
	}//������
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		//�̺�Ʈ�� �߻��ϴ� ������Ʈ�� label Ȥ�� ������Ʈ���� return(String)
		e.getActionCommand();
		
		if(ob==button1){
			field.requestFocus();
			shakeNum();
			if(start==0){
				area.setText("\t\t\t\t������ �����մϴ�.\n");
			}else{
				area.append("\t\t\t\t������ �����մϴ�.\n");
			}
			initCnt();
			start++;
		}else if(ob==button2){
			area.setText(" ");
		}else if(ob==button3){
			if(start==0){
				JOptionPane.showMessageDialog(this, "������ ���� ��������!");
//				area.setText("\t\t\t\t������ ���� ��������!!!");
			}else{
				area.append("\t\t\t\t������ ["+ RanNum[0]+" "+RanNum[1]+" "+RanNum[2]+"] �Դϴ�\n");
			}
		}else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new NumberBaseball("���ھ߱�!!");
	}//main
}//class
