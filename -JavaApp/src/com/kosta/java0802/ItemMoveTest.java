package com.kosta.java0802;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemMoveTest extends Frame implements ActionListener{
	
	//1행 3열의 그리드 레이아웃
	//가운데 프레임을 기준으로 좌우대칭
	//좌우에 위치한 각각의 프레임은 Center와 South로 구성된 두개의 패널
	//Center = list, South= textfield
	
	//이벤트 : 텍스트 박스에 글자를 입력하고 enter를 치면 List에 문자열 추가
	
	//중간 레이아웃 : 4개의 화살표 모양을 가진 ()버튼
	//4개의 버튼을 표현하기위해 6칸으로 나눈후 3열로 나누어 
	//상단과 하단에 1칸씩을 비우고 각칸에 버튼을 각각 위치
	
	//따라서 nullLayout을 이용해서 각버튼의 setLocation(x,y)잡고 길이를 정할 것
	
	//텍스트필드로부터 입력되어 올라간 List 중 한가지 요소를 클릭한후
	
	//1,3버튼 선택된 요소를 반대방향으로 이동
	//2,4버튼 각 방향에 위치한 모든 요소를 반대 방향으로 이동
	
	//전체 요소 버튼 4개, 리스트2, 텍스트필드2
	//이벤트소스 : 버튼4개, 텍스트필드(엔터)2
	
	//컴포넌트 선언
	Button button1, button2, button3, button4;
	Panel panel1, panel2,panel3;
	List list1, list2;
	TextField field1, field2; //ActionEvent
	
	public ItemMoveTest(String title) {
		super(title);
		
		//객체 생성
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		
		button1 = new Button("▷");
		button2 = new Button("▶");
		button3 = new Button("◁");
		button4 = new Button("◀");
		
		list1 = new List();
		list2 = new List();
		
		field1 = new TextField();
		field2 = new TextField();
		
		
		//레이아웃 설정
		
		setLayout(new GridLayout(0, 3));
		setBackground(Color.orange);
		
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(null);
		panel3.setLayout(new BorderLayout());

		//속성설정
		add(panel1);
			panel1.add("Center", list1);
			panel1.add("South" ,field1);
		
		add(panel2);
			panel2.add(button1);
			button1.setBounds(35, 70, 25, 25);
			panel2.add(button2);
			button2.setBounds(35, 120, 25, 25);
			panel2.add(button3);
			button3.setBounds(35, 170, 25, 25);
			panel2.add(button4);
			button4.setBounds(35, 220, 25, 25);
		
		add(panel3);
			panel3.add("Center", list2);
			panel3.add("South" ,field2);
		
		//마무리메소드
		setVisible(true);
		setSize(300, 350);
		
		//이벤트연결
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);	
		
		//이벤트 구현
		
		field1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					if(field1.getText().equals(""))
					{
						return ;
					}
					else{
						list1.add(field1.getText());
						field1.setText(null);
//						if(field1.getText().equals(""))
					}
				}
			}
		});
		
		//field2영역에 대한 이벤트리스너 및 핸들러(keyAdapter-keyPressed)추가
		//Enterkey에 대한 keycode를 식별한후 로직수행
		//로직 :1.enter키값 검사
		//		2.널검사
		//		3.리스트에 field값(field1.getText())추가
		//		4.field의 값 삭제 (field1.setText(null));
		field2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					//if(field1.getText().equals(""))
					if(field1.getText().length()==0)
					{
						return ;
					}
					else	{
						list2.add(field2.getText());
						field2.setText(null);
					}//else	
				}//outer if
			}//keyPressed
		});//addKeyListener
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}
	
	
	//button1 ~ button2
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		//e의 값 = (이벤트가 발생한 컴포넌트의 주소값)
		
		if(ob==button1){
			int i = list1.getSelectedIndex(); //선택한 List의 index를 얻어서
			list2.add(list1.getItem(i)); //반대쪽 list에 값을 추가하고
			list1.remove(i);//넘겨진 데이터를 삭제
		}
		else if(ob==button2){
//			System.out.println(list1.getItemCount());
			//for문은 조건식으로 분기한후, 증감식을 수행하기 때문에
			//for문의 조건식을 검사할때마다 list1.getItemCount()의 값이 변할수 있기 때문에
			//list1에 있는모든값을 getItemCount값 만큼 긁어서 list2에 추가한후
			//for 루프가 모두 수행된뒤 list1의 모든 값들을 removeAll()삭제 한다.
			for (int i = 0; i < list1.getItemCount(); i++) {				
					list2.add(list1.getItem(i));
			}
			list1.removeAll();
//			System.out.println(list1.getItemCount());
		}
		else if(ob==button3){
			int i = list2.getSelectedIndex();
			list1.add(list2.getItem(i));
			list2.remove(i);
		}
			
		else {
			for (int i = 0; i < list2.getItemCount(); i++) {
				list1.add(list2.getItem(i));
			}
			list2.removeAll();
		}
	}
	
	public static void main(String[] args) {
		new ItemMoveTest("ItemMove Test");
	}



}
