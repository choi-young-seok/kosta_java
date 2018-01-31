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
	
//배열 초기화 메소드
	public void arrayInit(){
		for (int i = 0; i < RanNum.length; i++) {
			RanNum[i] = i;
		}
	}
//난수발생 메소드
	public void shakeNum(){
		int temp;
		for (int i = 0; i < 10000; i++) {
			int shake = random.nextInt(10);
			temp = RanNum[0];
			RanNum[0] = RanNum[shake];
			RanNum[shake] = temp;
		}//for
	}
//숫자 일치 검사 메소드
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
	
//횟수에 따른 멘트 출력 메소드
	public void printMent(){
		if(S==3){
			if(cnt<5){
				area.append("\t\t\t평균 이상 입니다. \n");
				area.append("\t\t\t축하합니다. 정답입니다. 총 횟수 : "+(cnt+1)+"\n\t\t\t---------------------------------\n");
				start=0;
			}
			else{
				area.append("\t\t\t조금 더 노력하세요 ~!! \n");
				area.append("\t\t\t축하합니다. 정답입니다. 총 횟수 : "+(cnt+1)+"\n\t\t\t---------------------------------\n");
				start=0;
			}
		}
		
	}
//feild.getText의 String값을 int형 배열로 변환 메소드
	public void toIntArray(String input){
		String inputNumArray[]=input.split("");
		for (int i = 0; i < inputNumArray.length; i++) {
			toIntArray[i]=Integer.parseInt(inputNumArray[i]);
		}
	}
//수행횟수 초기화 메소드
	public void initCnt(){
		cnt = 0;
	}
//NumberFormatException처리할것 + (공백검사,숫자검사,길이검사)
	public boolean regexp (String input){
		if(input.equals("")){
			JOptionPane.showMessageDialog(this, "공백은 입력 할 수 없습니다!");
//			area.setText("공백은 입력할수 없습니다.\n");
			b=false;
			return b;
		}
		else if(input.length()!=3){
			try {
				if(!input.matches("[0-9]{3}")){ //[\\d] = [0-9]
					JOptionPane.showMessageDialog(this, "숫자만 입력하세요!");
//					area.append("\t\t\t\t숫자만 입력하세요!\n");
					field.setText("");
					b=false;
					return b;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(this, "3자리 숫자만 입력하세요!");
//			area.append("\t\t\t\t3자리 숫자만 입력하세요!\n");
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
		button1 = new JButton("새게임");
		//random을 이용하여 3가지 숫자 안겹치게 출력
		button2 = new JButton("지우기");
		//text필드와 area 지우기
		button3 = new JButton("정답");
		//정답 출력
		button4 = new JButton("나가기");
		//System.exit(0)
		
		area = new TextArea();
			area.setEditable(false);
//			area.setEnabled(false);
		area.isBackgroundSet();
		jScrollPane = new JScrollPane(area);
			
		field = new TextField(45);
		label = new Label("입력 : ");
		
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
						area.append("\t\t\t입력 숫자 : "+field.getText()+"\t"+(cnt+1)+"회 :  ");
						checkNum();
						field.setText(null);
						printMent();
						cnt++;
					}
//					field.setText("");
				}//if
			}//keyPressed
		});//KeyListener
	}//생성자
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		//이벤트가 발생하는 컴포넌트의 label 혹은 컴포넌트명을 return(String)
		e.getActionCommand();
		
		if(ob==button1){
			field.requestFocus();
			shakeNum();
			if(start==0){
				area.setText("\t\t\t\t게임을 시작합니다.\n");
			}else{
				area.append("\t\t\t\t게임을 시작합니다.\n");
			}
			initCnt();
			start++;
		}else if(ob==button2){
			area.setText(" ");
		}else if(ob==button3){
			if(start==0){
				JOptionPane.showMessageDialog(this, "시작을 먼저 누르세요!");
//				area.setText("\t\t\t\t시작을 먼저 누르세요!!!");
			}else{
				area.append("\t\t\t\t정답은 ["+ RanNum[0]+" "+RanNum[1]+" "+RanNum[2]+"] 입니다\n");
			}
		}else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new NumberBaseball("숫자야구!!");
	}//main
}//class
