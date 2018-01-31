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
	1.뷰등록
	2.모델등록
	3.
*/
public class PersonController implements ActionListener{
	//뷰등록
	MainView mainView;
	InputForm inputForm;
	int personCount;
	PersonModel personModel;
	boolean b = true;
	int getSelectedRow;
	
	public PersonController() {
		//뷰 객체 생성
		mainView = new MainView("MainView");
		inputForm = new InputForm("InputFrom");
		//모델객체 생성
		personModel = new PersonModel();
		//뷰 이벤트 리스너 등록

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
		
		//익명메소드의 위치 : 연결자위치
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
			JOptionPane.showMessageDialog(inputForm, "이름을 입력하세요");
			inputForm.field1.requestFocus();
//				return checkNull;
		}else if(strAge.equals("")){
			JOptionPane.showMessageDialog(inputForm, "나이를 입력하세요");
			inputForm.field2.requestFocus();
//				return checkNull;
		}
		else if(job.equals("")){
			JOptionPane.showMessageDialog(inputForm, "직업을 입력하세요");
			inputForm.field3.requestFocus();
//				return checkNull;
		}
		else{
				checkNull=false;
		}
		}
	}	
	//뷰 이벤트 핸들러
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		int delRowIndex = mainView.table.getSelectedRow();

		//입력
		if(ob==mainView.button1){
			//inputFrom의 field1~3초기화
			inputForm.initForm();
			//mainView  프레임 닫기
			mainView.setVisible(false);
			//inputForm 프레임 열기
			inputForm.setVisible(true);	
			inputForm.button1.setText("입력");
//			switchButton();
			b = true;
		}
		//수정
		else if(ob==mainView.button2){
			//inputForm 프레임 열기(입력된값 필드에 넣어진체로)
			inputForm.setVisible(true);
			inputForm.setTitle("UpdateForm");
			inputForm.button1.setText("수정");
			//mainView  프레임 닫기
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
		//삭제
		else if(ob==mainView.button3){
			int no = mainView.table.getSelectedRow();
			personModel.delete(no);
			personCount--;
			mainView.diplayTable(personModel.selectAll());
			
			//personCount값이 출력되는 no값 삭제시 -1할것
		}
		//종료
		else if(ob == mainView.button4){
			System.exit(0);
		}
		//수정
		else if(ob== inputForm.button1){
			//입력
			
			String name = inputForm.field1.getText();
			String strAge = inputForm.field2.getText();
			String job = inputForm.field3.getText();
			isEmpty(name, strAge, job);
			int age = Integer.parseInt(strAge);

			Person person;
			
			if(b){
				personCount++;
				//inputForm의 field로부터 입력받은 값을 각 자료형에 맞는 변수에 저장
	
				//입력받은 값을 저장한 변수를 person객체를 생성한후 person형 데이터로 전환
				person = new Person(personCount, name, age, job);
				//입력받은 person데이터를 insert()의 파라미터로 넘김
				personModel.insert(person);
				//처음부터 전체 벡터의 사이즈까지 각 벡터에 저장된 person객체를 출력
			 	mainView.diplayTable(personModel.selectAll());
			 	
			 	inputForm.setVisible(false);
			 	mainView.setVisible(true);
		 	}
			
			else{//수정
				person = new Person(0, name, age, job);
				//inputForm에서 수정하려고 입력한 값을 받아와서 person객체에 저장
				personModel.update(getSelectedRow, person);
	
				mainView.diplayTable(personModel.selectAll());
				
				mainView.setVisible(true);
				inputForm.setVisible(false);
				personModel.selectAll();
			}
		}
		//취소
		else{
			//inputForm프레임 닫기
			inputForm.setVisible(false);
			//mainView 프레임 열기
			mainView.setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
		new PersonController();
	}//main
}//class
