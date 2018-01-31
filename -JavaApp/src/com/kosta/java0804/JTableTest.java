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
	 JTable : 데이터들을 행과 열 형태로 화면에 출력해 주는 컴포넌트.
	 
	 ex)
	 이름	나이	직업	
	 -------------------
	 홍길동	 13		학생
	 길라임	 15		학생
	 
	 
	*/
	
	public JTableTest(String title) {
		super(title);
//		rowData1 = new Vector<>();
//
//		columnNames1 = new Vector<>();


		Object rowData[][] = {
				{"홍길동",13,"학생"},
				{"길라임",15,"학생"},
				{"김유신",17,"화랑"},
		};
			 
		 
		Object columnNames[] ={"이름","나이","직업"};
//		
//		rowData1.add(rowData);
//		columnNames1.add(columnNames);
//	
		
		table = new JTable(rowData, columnNames);
		jScrollPane = new JScrollPane(table);
		
		add(jScrollPane);
		
		//값 가져오기
		System.out.println("table.getValueAt(0, 0) : " + table.getValueAt(0, 0));
		System.out.println("table.getValueAt(2, 2) : " + table.getValueAt(2, 2));
		
		//값 변경하기
		
		table.setValueAt("19", 2, 1);
		table.setValueAt("장군", 2, 2);
		
		setVisible(true);
		setBounds(300,200,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest("JTableTest");
	}

}
