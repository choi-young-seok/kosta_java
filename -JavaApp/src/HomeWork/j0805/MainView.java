package HomeWork.j0805;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainView extends JFrame{
	JTable table;
	JButton inputButton, updateButton, deleteButton, exitButton;
	DefaultTableModel defaultTableModel;
	JScrollPane scroll;
	JPanel panel;

	public MainView() {
		inputButton = new JButton("입력");
		updateButton = new JButton("수정");
		deleteButton = new JButton("삭제");
		exitButton = new JButton("종료");
		
		panel = new JPanel();
		
		Object[] title = {"번호", "이름", "나이", "직업"};
		Object[][] data = new Object[0][4];
		
		defaultTableModel = new DefaultTableModel(data, title);
		table = new JTable(defaultTableModel);
		scroll = new JScrollPane(table);
		
		setLayout(new BorderLayout());
		panel.setLayout(new FlowLayout());
		
		add("Center", scroll);
		add("South", panel);
			panel.add(inputButton);
			panel.add(updateButton);
			panel.add(deleteButton);
			panel.add(exitButton);
		
		setVisible(true);
		setTitle("Main View");
		setBounds(300,200,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void displayView(){
		//테이블에 벡트의 모든 값을 출력
	}
	
}
