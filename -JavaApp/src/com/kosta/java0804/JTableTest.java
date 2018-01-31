package com.kosta.java0804;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame{
	 
	JTable table;
//	String rowData[][], columnNames[];
	JScrollPane jScrollPane;
	Vector<Object> rowData1, columnNames1;
	
	/*
	 JTable : �����͵��� ��� �� ���·� ȭ�鿡 ����� �ִ� ������Ʈ.
	 
	 ex)
	 �̸�	����	����	
	 -------------------
	 ȫ�浿	 13		�л�
	 �����	 15		�л�
	 
	 
	*/
	
	public JTableTest(String title) {
		super(title);
//		rowData1 = new Vector<>();
//
//		columnNames1 = new Vector<>();


		Object rowData[][] = {
				{"ȫ�浿",13,"�л�"},
				{"�����",15,"�л�"},
				{"������",17,"ȭ��"},
		};
			 
		 
		Object columnNames[] ={"�̸�","����","����"};
//		
//		rowData1.add(rowData);
//		columnNames1.add(columnNames);
//	
		
		table = new JTable(rowData, columnNames);
		jScrollPane = new JScrollPane(table);
		
		add(jScrollPane);
		
		//�� ��������
		System.out.println("table.getValueAt(0, 0) : " + table.getValueAt(0, 0));
		System.out.println("table.getValueAt(2, 2) : " + table.getValueAt(2, 2));
		
		//�� �����ϱ�
		
		table.setValueAt("19", 2, 1);
		table.setValueAt("�屺", 2, 2);
		
		setVisible(true);
		setBounds(300,200,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest("JTableTest");
	}

}
