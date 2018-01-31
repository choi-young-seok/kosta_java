package com.kosta.jaelee.person.VIew;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputForm extends JFrame{
	   JLabel la_name, la_age, la_job;
	   public JTextField tf_name, tf_age, tf_job;
	   public JButton bt_submit, bt_cancel;
		
	   public InputForm() {
		 setTitle("입력폼");
		 la_name = new JLabel("이름");
		 la_age = new JLabel("나이");
		 la_job = new JLabel("직업");
		 
		 tf_name = new JTextField();
		 tf_age = new JTextField();
		 tf_job = new JTextField();
		   
		 bt_submit = new JButton("입력");
		 bt_cancel = new JButton("취소");
		 
		 int la_x=30;
		 int la_y=30;
		 
		 int tf_x=70;
		 int tf_y=30;
		 
		 la_name.setBounds(la_x, la_y, 30,30);
		 la_age.setBounds(la_x, la_y+=50, 30,30);
		 la_job.setBounds(la_x, la_y+=50, 30,30);

		 tf_name.setBounds(tf_x, tf_y, 80,30);
		 tf_age.setBounds(tf_x, tf_y+=50, 80,30);
		 tf_job.setBounds(tf_x, tf_y+=50, 80,30);
		 
		 bt_submit.setBounds(la_x, la_y+=50, 60,30);
		 bt_cancel.setBounds(la_x+70, la_y, 60,30);
		 
		 setLayout(null);
		 add(la_name);
		 add(la_age);
		 add(la_job);
		 add(tf_name);
		 add(tf_age);
		 add(tf_job);
		 add(bt_submit);
		 add(bt_cancel);
		 
		 setBounds(450,300,210,280);
		 //setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);		 
	   }//생성자

	   public void initForm(){//입력폼 초기화
		 setTitle("입력폼");//프레임의 타이틀 변경
		 bt_submit.setText("입력");//수정버튼 ----> 입력버튼
		 //입력폼일때는 이름입력이 가능!!		 
		 tf_name.setEditable(true);
		 tf_name.setText(""); 
		 tf_age.setText(""); 
		 tf_job.setText(""); 
		 
		 tf_name.requestFocus();//최초 이름필드에 작성이 편하게 포커스 설정		 
	   }//initForm
	   
	   public void initUpForm(){//수정폼 초기화
		 setTitle("수정폼");//프레임의 타이틀 변경
		 bt_submit.setText("수정");//입력버튼 ----> 수정버튼
		 
		 //수정폼일때는 이름변경 불가
		 tf_name.setEditable(false);
		 
	   }//initUpForm
	   
}//InputForm




