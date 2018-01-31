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
	
	   JPanel southp, northp;//northp:시계패널

	   public MainView() {		   
		  setTitle("MainView");

		  Object rowData[][]= new Object[0][4];
		  String columnTitle[]={"번호","이름","나이","직업"};
		  dtm = new DefaultTableModel(rowData,columnTitle);
		  table = new JTable(dtm);
		  scrollTable = new JScrollPane(table);
		  
		  bt_insert = new JButton("입력");
		  bt_update = new JButton("수정");
		  bt_delete = new JButton("삭제");
		  bt_exit = new JButton("종료");
		  
		  northp = new JPanel();
//		  la_clock = new JLabel("시간 : ");
		  
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
//		  Thread t = new Thread(this);//run메소드가 구현된 위치 : this
		  //Thread의 run메소드를 사용하기 위한 Thread객체를 생성
//		  t.start();
//		  1회용
//		  new Thread(this).start();

		  
		  setBounds(400,200,300,300);
		  setVisible(true);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
	   }//생성자	   
      
	   public void displayTable(Vector<Person> v){
		  dtm.setRowCount(0);//출력되는 행의 위치를 지정!!		   
		   
		  //dtm.addRow(Object []rowData);
		  for(int i=0; i<v.size(); i++){//벡터 인덱스를 표현
			  Person p = v.get(i);
			  Object rowData[]={ p.getNo(),p.getName(),p.getAge(),p.getJob()};
			                     //번호       이름        나이      직업
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
		   //현재 프레임의 실행과독립적인 실행(쓰레드)을 하기 위해 Thread class의 run메소드 안에 내용을 정의
		   while(true){
			   Calendar cal = new GregorianCalendar(); 
	
				
			//Calendar는 추상클래스 이므로 자식클래스 GregorianCalendar를 통해 객체 생성
				int year = cal.get(Calendar.YEAR);
				int month = cal.get(Calendar.MONTH)+1;
				int date = cal.get(Calendar.DATE);
				int hour = cal.get(Calendar.HOUR);
				int minute = cal.get(Calendar.MINUTE);
				int second = cal.get(Calendar.SECOND);
				   
				String time = year+"년 "+month+"월 "+date+"일 "+hour+"시 "+minute+"분 "+second+"초";
				   
				//cal객체 안에는 시스템 날짜 정보 전체가 저장
				//그중 얻고자 하는 정보를 cla객체의 get메소드의 파라미터로 기술
				//cla.get(얻어오고자하는 정보);
				   
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







