package com.kosta.person.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import com.kosta.person.dto.Person;
import com.kosta.person.model.PersonModel;
import com.kosta.person.view.InputForm;
import com.kosta.person.view.MainView;
/*
	1.����
	2.�𵨵��
	3.
*/
public class PersonController implements ActionListener{
	//����
	MainView mainView;
	InputForm inputForm;
	int personCount;
	PersonModel personModel;
	boolean b = true;
	int getSelectedRow;
	
	public PersonController() {
		//�� ��ü ����
		mainView = new MainView("MainView");
		inputForm = new InputForm("InputFrom");
		//�𵨰�ü ����
		personModel = new PersonModel();
		//�� �̺�Ʈ ������ ���

		eventUp();
	}
	public void eventUp(){
		mainView.button1.addActionListener(this);
		mainView.button2.addActionListener(this);
		mainView.button3.addActionListener(this);
		mainView.button4.addActionListener(this);
		
		inputForm.button1.addActionListener(this);
		inputForm.button2.addActionListener(this);
		
		//inputForm.field1.addActionListener(this);
		//inputForm.field2.addActionListener(this);
		//inputForm.field3.addActionListener(this);
		
		//�͸�޼ҵ��� ��ġ : ��������ġ
		inputForm.field1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					inputForm.field2.requestFocus();
				}
			}
		});
		
		inputForm.field2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					inputForm.field3.requestFocus();
				}
			}
		});
		
		inputForm.field3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
				{
					inputForm.button1.doClick();
				}
			}
		});
		
	}
	
	public void isEmpty(String name, String strAge, String job){	
		boolean checkNull=true;
		while(checkNull){
		if(name == null || name.length() < 1){
			JOptionPane.showMessageDialog(inputForm, "�̸��� �Է��ϼ���");
			inputForm.field1.requestFocus();
//				return checkNull;
		}else if(strAge.equals("")){
			JOptionPane.showMessageDialog(inputForm, "���̸� �Է��ϼ���");
			inputForm.field2.requestFocus();
//				return checkNull;
		}
		else if(job.equals("")){
			JOptionPane.showMessageDialog(inputForm, "������ �Է��ϼ���");
			inputForm.field3.requestFocus();
//				return checkNull;
		}
		else{
				checkNull=false;
		}
		}
	}	
	//�� �̺�Ʈ �ڵ鷯
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		int delRowIndex = mainView.table.getSelectedRow();

		//�Է�
		if(ob==mainView.button1){
			//inputFrom�� field1~3�ʱ�ȭ
			inputForm.initForm();
			//mainView  ������ �ݱ�
			mainView.setVisible(false);
			//inputForm ������ ����
			inputForm.setVisible(true);	
			inputForm.button1.setText("�Է�");
//			switchButton();
			b = true;
		}
		//����
		else if(ob==mainView.button2){
			//inputForm ������ ����(�ԷµȰ� �ʵ忡 �־���ü��)
			inputForm.setVisible(true);
			inputForm.setTitle("UpdateForm");
			inputForm.button1.setText("����");
			//mainView  ������ �ݱ�
			mainView.setVisible(false);
			
			b=false;

			getSelectedRow = 0;
			getSelectedRow = mainView.table.getSelectedRow()+1;
//			int no = mainView.table.getSelectedRow()+1;
			Person person = personModel.select(getSelectedRow);

			inputForm.field1.setText(person.getName());
			inputForm.field2.setText(""+person.getAge());
			inputForm.field3.setText(person.getJob());
			
//			switchButton();
		}
		//����
		else if(ob==mainView.button3){
			int no = mainView.table.getSelectedRow();
			personModel.delete(no);
			personCount--;
			mainView.diplayTable(personModel.selectAll());
			
			//personCount���� ��µǴ� no�� ������ -1�Ұ�
		}
		//����
		else if(ob == mainView.button4){
			System.exit(0);
		}
		//����
		else if(ob== inputForm.button1){
			//�Է�
			
			String name = inputForm.field1.getText();
			String strAge = inputForm.field2.getText();
			String job = inputForm.field3.getText();
			isEmpty(name, strAge, job);
			int age = Integer.parseInt(strAge);

			Person person;
			
			if(b){
				personCount++;
				//inputForm�� field�κ��� �Է¹��� ���� �� �ڷ����� �´� ������ ����
	
				//�Է¹��� ���� ������ ������ person��ü�� �������� person�� �����ͷ� ��ȯ
				person = new Person(personCount, name, age, job);
				//�Է¹��� person�����͸� insert()�� �Ķ���ͷ� �ѱ�
				personModel.insert(person);
				//ó������ ��ü ������ ��������� �� ���Ϳ� ����� person��ü�� ���
			 	mainView.diplayTable(personModel.selectAll());
			 	
			 	inputForm.setVisible(false);
			 	mainView.setVisible(true);
		 	}
			
			else{//����
				person = new Person(0, name, age, job);
				//inputForm���� �����Ϸ��� �Է��� ���� �޾ƿͼ� person��ü�� ����
				personModel.update(getSelectedRow, person);
	
				mainView.diplayTable(personModel.selectAll());
				
				mainView.setVisible(true);
				inputForm.setVisible(false);
				personModel.selectAll();
			}
		}
		//���
		else{
			//inputForm������ �ݱ�
			inputForm.setVisible(false);
			//mainView ������ ����
			mainView.setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
		new PersonController();
	}//main
}//class
