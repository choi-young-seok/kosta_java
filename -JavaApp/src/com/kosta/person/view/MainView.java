package com.kosta.person.view;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosta.person.dto.Person;

public class MainView extends JFrame{
	public JTable table;
	public JButton button1, button2, button3, button4;
	public DefaultTableModel defaultTableModel;
	public JScrollPane jScrollPane;
	public JPanel panel;
	Person person;
//	public Vector<Object> vector1, vector2;;
	
	
	public MainView(String title) {
		super(title);
		
//		vector1 = new Vector<>();
//			vector1.add("1");
//			vector1.add("������");
//			vector1.add("16");
//			vector1.add("ȭ��");
		
//		vector2 = new Vector<>();
	//		vector2.add("��ȣ");
	//		vector2.add("�̸�");
	//		vector2.add("����");
	//		vector2.add("����");
		
		Object[][] data = new Object[0][4];
		Object[] tableTitle = {"��ȣ","�̸�","����","����"};

		defaultTableModel = new DefaultTableModel(data, tableTitle);
		table = new JTable(defaultTableModel);
		jScrollPane = new JScrollPane(table);
		
		panel = new JPanel();
		
		button1 = new JButton("�Է�");
		button2 = new JButton("����");
		button3 = new JButton("����");
		button4 = new JButton("����");
		
		setLayout(new BorderLayout());
		
		add("Center",jScrollPane);
		add("South", panel);
			panel.add(button1);
			panel.add(button2);
			panel.add(button3);
			panel.add(button4);

		setVisible(true);
		setBounds(300,200,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
	}//������
	
	//������ ������ JTable�� ����ϴ� �޼ҵ�
	public void diplayTable(Vector<Person> v){
		defaultTableModel.setRowCount(0);//��µǴ� ���� ��ġ�� ����
		
		for (int i = 0; i < v.size(); i++) {
			Person p = v.get(i);
			Object rowData[] = {p.getNo(), p.getName(), p.getAge(), p.getJob()}; 
					//v.toArray();
						   
			defaultTableModel.addRow(rowData);
		}
	}
}
