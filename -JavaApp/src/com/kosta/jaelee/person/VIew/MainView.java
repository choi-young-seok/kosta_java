package com.kosta.jaelee.person.VIew;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosta.jaelee.person.model.*;

public class MainView extends JFrame implements Runnable{
	   DefaultTableModel dtm;
	   public JTable table;	
	   JScrollPane scrollTable;
	   JLabel la_clock;
	   
	   public JButton bt_insert, bt_update, bt_delete, bt_exit;
	
	   JPanel southp, northp;//northp:�ð��г�

	   public MainView() {		   
		  setTitle("MainView");

		  Object rowData[][]= new Object[0][4];
		  String columnTitle[]={"��ȣ","�̸�","����","����"};
		  dtm = new DefaultTableModel(rowData,columnTitle);
		  table = new JTable(dtm);
		  scrollTable = new JScrollPane(table);
		  
		  bt_insert = new JButton("�Է�");
		  bt_update = new JButton("����");
		  bt_delete = new JButton("����");
		  bt_exit = new JButton("����");
		  
		  northp = new JPanel();
//		  la_clock = new JLabel("�ð� : ");
		  
		  southp = new JPanel();
			  southp.add(bt_insert);
			  southp.add(bt_update);
			  southp.add(bt_delete);
			  southp.add(bt_exit);
		  
//		  northp.add(la_clock);
		  
		  add("Center",scrollTable);
		  add("South",southp);
		  add("North",northp);
		  
//		  currentTimePrint();
//		  Thread t = new Thread(this);//run�޼ҵ尡 ������ ��ġ : this
		  //Thread�� run�޼ҵ带 ����ϱ� ���� Thread��ü�� ����
//		  t.start();
//		  1ȸ��
//		  new Thread(this).start();

		  
		  setBounds(400,200,300,300);
		  setVisible(true);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
	   }//������	   
      
	   public void displayTable(Vector<Person> v){
		  dtm.setRowCount(0);//��µǴ� ���� ��ġ�� ����!!		   
		   
		  //dtm.addRow(Object []rowData);
		  for(int i=0; i<v.size(); i++){//���� �ε����� ǥ��
			  Person p = v.get(i);
			  Object rowData[]={ p.getNo(),p.getName(),p.getAge(),p.getJob()};
			                     //��ȣ       �̸�        ����      ����
			  dtm.addRow(rowData);
		  }
	   }//displayTable
	   
	   public String showInput(String msg){
		  String str = JOptionPane.showInputDialog(this,msg); 
		  return str;
	   }//showInput
	   
//	   public void currentTimePrint(){
	   
	   @Override
	   public void run(){ 
		   //���� �������� ������������� ����(������)�� �ϱ� ���� Thread class�� run�޼ҵ� �ȿ� ������ ����
		   while(true){
			   Calendar cal = new GregorianCalendar(); 
	
				
			//Calendar�� �߻�Ŭ���� �̹Ƿ� �ڽ�Ŭ���� GregorianCalendar�� ���� ��ü ����
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH)+1;
				int date = cal.get(Calendar.DATE);
				int hour = cal.get(Calendar.HOUR);
				int minute = cal.get(Calendar.MINUTE);
				int second = cal.get(Calendar.SECOND);
				   
				String time = year+"�� "+month+"�� "+date+"�� "+hour+"�� "+minute+"�� "+second+"��";
				   
				//cal��ü �ȿ��� �ý��� ��¥ ���� ��ü�� ����
				//���� ����� �ϴ� ������ cla��ü�� get�޼ҵ��� �Ķ���ͷ� ���
				//cla.get(���������ϴ� ����);
				   
				la_clock.setText(time);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   }//while
		}//Calendar
	   
}//MainView	   







