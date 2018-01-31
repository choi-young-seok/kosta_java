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
	
	//1�� 3���� �׸��� ���̾ƿ�
	//��� �������� �������� �¿��Ī
	//�¿쿡 ��ġ�� ������ �������� Center�� South�� ������ �ΰ��� �г�
	//Center = list, South= textfield
	
	//�̺�Ʈ : �ؽ�Ʈ �ڽ��� ���ڸ� �Է��ϰ� enter�� ġ�� List�� ���ڿ� �߰�
	
	//�߰� ���̾ƿ� : 4���� ȭ��ǥ ����� ���� ()��ư
	//4���� ��ư�� ǥ���ϱ����� 6ĭ���� ������ 3���� ������ 
	//��ܰ� �ϴܿ� 1ĭ���� ���� ��ĭ�� ��ư�� ���� ��ġ
	
	//���� nullLayout�� �̿��ؼ� ����ư�� setLocation(x,y)��� ���̸� ���� ��
	
	//�ؽ�Ʈ�ʵ�κ��� �ԷµǾ� �ö� List �� �Ѱ��� ��Ҹ� Ŭ������
	
	//1,3��ư ���õ� ��Ҹ� �ݴ�������� �̵�
	//2,4��ư �� ���⿡ ��ġ�� ��� ��Ҹ� �ݴ� �������� �̵�
	
	//��ü ��� ��ư 4��, ����Ʈ2, �ؽ�Ʈ�ʵ�2
	//�̺�Ʈ�ҽ� : ��ư4��, �ؽ�Ʈ�ʵ�(����)2
	
	//������Ʈ ����
	Button button1, button2, button3, button4;
	Panel panel1, panel2,panel3;
	List list1, list2;
	TextField field1, field2; //ActionEvent
	
	public ItemMoveTest(String title) {
		super(title);
		
		//��ü ����
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		
		button1 = new Button("��");
		button2 = new Button("��");
		button3 = new Button("��");
		button4 = new Button("��");
		
		list1 = new List();
		list2 = new List();
		
		field1 = new TextField();
		field2 = new TextField();
		
		
		//���̾ƿ� ����
		
		setLayout(new GridLayout(0, 3));
		setBackground(Color.orange);
		
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(null);
		panel3.setLayout(new BorderLayout());

		//�Ӽ�����
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
		
		//�������޼ҵ�
		setVisible(true);
		setSize(300, 350);
		
		//�̺�Ʈ����
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);	
		
		//�̺�Ʈ ����
		
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
		
		//field2������ ���� �̺�Ʈ������ �� �ڵ鷯(keyAdapter-keyPressed)�߰�
		//Enterkey�� ���� keycode�� �ĺ����� ��������
		//���� :1.enterŰ�� �˻�
		//		2.�ΰ˻�
		//		3.����Ʈ�� field��(field1.getText())�߰�
		//		4.field�� �� ���� (field1.setText(null));
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
		//e�� �� = (�̺�Ʈ�� �߻��� ������Ʈ�� �ּҰ�)
		
		if(ob==button1){
			int i = list1.getSelectedIndex(); //������ List�� index�� ��
			list2.add(list1.getItem(i)); //�ݴ��� list�� ���� �߰��ϰ�
			list1.remove(i);//�Ѱ��� �����͸� ����
		}
		else if(ob==button2){
//			System.out.println(list1.getItemCount());
			//for���� ���ǽ����� �б�����, �������� �����ϱ� ������
			//for���� ���ǽ��� �˻��Ҷ����� list1.getItemCount()�� ���� ���Ҽ� �ֱ� ������
			//list1�� �ִ¸�簪�� getItemCount�� ��ŭ �ܾ list2�� �߰�����
			//for ������ ��� ����ȵ� list1�� ��� ������ removeAll()���� �Ѵ�.
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
