package com.kosta.java0804;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest2 extends JFrame{
	
	JTable table;
	JScrollPane scroll;
	DefaultTableModel defaultTableModel;
	
	public JTableTest2(String title) {
		super(title);
		
		
		Object[][] data = new Object[0][4];
		
		Object columnNames[] ={"이름","나이","직업"};
		defaultTableModel = new DefaultTableModel(data, columnNames);
		table = new JTable(defaultTableModel);
		scroll = new JScrollPane(table);
		
		//데이터 추가 : Object[]
		Object rowData[] = {"홍길동",13,"학생"};
		defaultTableModel.addRow(rowData);
		
		//데이터 추가 : Vector
		Vector<Object> vector = new Vector<>();
			vector.add("김주원");
			vector.add(17);
			vector.add("학생");
		defaultTableModel.addRow(vector);
		
		//벡터안의 데이터를 1차원 배열로 변환하는 메소드 toArray()
		Object rowData2[] = vector.toArray();
		defaultTableModel.addRow(rowData2);
		
		//데이터 삭제 : 인덱스를 이용 (JTable의 인덱스는 제목 행을 제외하고 0부터 시작)
		defaultTableModel.removeRow(1);
		
		//데이터 (삽입)추가 : 지정하는 인덱스에 삽입
		Object rowData4[] = {"김유신", 16, "화랑"};
		defaultTableModel.insertRow(1, rowData4);
		
		//행과 열의 갯수
		System.out.println(defaultTableModel.getRowCount());
		System.out.println(defaultTableModel.getColumnCount());
		
		add(scroll);
		setVisible(true);
		setBounds(300,200,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new JTableTest2("JTableTest2");
	}

}
