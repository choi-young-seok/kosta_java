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
		
		Object columnNames[] ={"�̸�","����","����"};
		defaultTableModel = new DefaultTableModel(data, columnNames);
		table = new JTable(defaultTableModel);
		scroll = new JScrollPane(table);
		
		//������ �߰� : Object[]
		Object rowData[] = {"ȫ�浿",13,"�л�"};
		defaultTableModel.addRow(rowData);
		
		//������ �߰� : Vector
		Vector<Object> vector = new Vector<>();
			vector.add("���ֿ�");
			vector.add(17);
			vector.add("�л�");
		defaultTableModel.addRow(vector);
		
		//���;��� �����͸� 1���� �迭�� ��ȯ�ϴ� �޼ҵ� toArray()
		Object rowData2[] = vector.toArray();
		defaultTableModel.addRow(rowData2);
		
		//������ ���� : �ε����� �̿� (JTable�� �ε����� ���� ���� �����ϰ� 0���� ����)
		defaultTableModel.removeRow(1);
		
		//������ (����)�߰� : �����ϴ� �ε����� ����
		Object rowData4[] = {"������", 16, "ȭ��"};
		defaultTableModel.insertRow(1, rowData4);
		
		//��� ���� ����
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
