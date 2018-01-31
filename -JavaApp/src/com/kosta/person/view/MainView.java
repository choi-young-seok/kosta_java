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
//			vector1.add("김유신");
//			vector1.add("16");
//			vector1.add("화랑");
		
//		vector2 = new Vector<>();
	//		vector2.add("번호");
	//		vector2.add("이름");
	//		vector2.add("나이");
	//		vector2.add("직업");
		
		Object[][] data = new Object[0][4];
		Object[] tableTitle = {"번호","이름","나이","직업"};

		defaultTableModel = new DefaultTableModel(data, tableTitle);
		table = new JTable(defaultTableModel);
		jScrollPane = new JScrollPane(table);
		
		panel = new JPanel();
		
		button1 = new JButton("입력");
		button2 = new JButton("수정");
		button3 = new JButton("삭제");
		button4 = new JButton("종료");
		
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
		
	}//생성자
	
	//벡터의 내용을 JTable에 출력하는 메소드
	public void diplayTable(Vector<Person> v){
		defaultTableModel.setRowCount(0);//출력되는 행위 위치를 지정
		
		for (int i = 0; i < v.size(); i++) {
			Person p = v.get(i);
			Object rowData[] = {p.getNo(), p.getName(), p.getAge(), p.getJob()}; 
					//v.toArray();
						   
			defaultTableModel.addRow(rowData);
		}
	}
}
