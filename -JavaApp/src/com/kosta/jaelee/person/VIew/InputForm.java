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
		 setTitle("�Է���");
		 la_name = new JLabel("�̸�");
		 la_age = new JLabel("����");
		 la_job = new JLabel("����");
		 
		 tf_name = new JTextField();
		 tf_age = new JTextField();
		 tf_job = new JTextField();
		   
		 bt_submit = new JButton("�Է�");
		 bt_cancel = new JButton("���");
		 
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
	   }//������

	   public void initForm(){//�Է��� �ʱ�ȭ
		 setTitle("�Է���");//�������� Ÿ��Ʋ ����
		 bt_submit.setText("�Է�");//������ư ----> �Է¹�ư
		 //�Է����϶��� �̸��Է��� ����!!		 
		 tf_name.setEditable(true);
		 tf_name.setText(""); 
		 tf_age.setText(""); 
		 tf_job.setText(""); 
		 
		 tf_name.requestFocus();//���� �̸��ʵ忡 �ۼ��� ���ϰ� ��Ŀ�� ����		 
	   }//initForm
	   
	   public void initUpForm(){//������ �ʱ�ȭ
		 setTitle("������");//�������� Ÿ��Ʋ ����
		 bt_submit.setText("����");//�Է¹�ư ----> ������ư
		 
		 //�������϶��� �̸����� �Ұ�
		 tf_name.setEditable(false);
		 
	   }//initUpForm
	   
}//InputForm




