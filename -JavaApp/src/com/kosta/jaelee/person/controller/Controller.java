package com.kosta.jaelee.person.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.kosta.jaelee.person.model.Model;
import com.kosta.jaelee.person.model.Person;
import com.kosta.jaelee.person.VIew.*;

public class Controller implements ActionListener {
	// 전체 어플리케이션의 흐름 제어

	// 뷰등록
	MainView mainV;
	InputForm form;

	// 모델등록
	Model m;

	int cntNo;// 입력되는 사람에게 (유일한)번호부여

	int upNo;// 수정할 Person의 번호를 임시로 저장
	/*
	 * <컨트롤러의 역할> 1. 사용자 요청에 대한 분석 2. 사용자 입력데이터를 얻어오기 3. 모델객체생성. 3_1. 메소드호출 3_2.
	 * 리턴데이터를 변수에 저장 4. 페이지(프레임) 이동
	 * 
	 * 옵션) 유효성검사
	 */

	public Controller() {
		mainV = new MainView();
		form = new InputForm();

		m = new Model();

		eventUp();
	}// 생성자

	private void eventUp() {// 이벤트소스-----이벤트핸들러를 연결
		// MainView등록
		mainV.bt_insert.addActionListener(this);
		mainV.bt_update.addActionListener(this);
		mainV.bt_delete.addActionListener(this);
		mainV.bt_exit.addActionListener(this);

		// InputForm등록
		form.bt_submit.addActionListener(this);
		form.bt_cancel.addActionListener(this);

		// InputForm - JTextField에서 엔터입력
		form.tf_name.addActionListener(this);
		form.tf_age.addActionListener(this);
		form.tf_job.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {// 이벤트 핸들러(처리부)
		Object ob = e.getSource();// 이벤트소스의 레퍼런스변수 얻어오기
		if (ob == mainV.bt_insert) {// 1. 메인에서 '입력'버튼을 클릭했다면
									// ------> 데이터 입력폼을 원했다면
			// 프레임 이동===> 4.
			form.initForm();
			mainV.setVisible(false);
			form.setVisible(true);// 입력폼 보여주기

		} else if (ob == mainV.bt_update) {// 1. 메인에서 '수정'버튼을 클릭했다면
			// 분석결과: 이전정보를 변경하겠다!!
			// 필요한것? 이전정보 얻기(Model클래스 select()메소드 필요),
			// 정보를 뿌려줄 폼이 필요!!

			int selectedRow = mainV.table.getSelectedRow();
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(mainV, "수정할 행을 선택!!");
				return;
			}
			int selectedNo = (int) mainV.table.getValueAt(selectedRow, 0);
			// (row,column) --> 0 column: 번호
			System.out.println("선택된 행: " + selectedRow);
			System.out.println("선택된 행의 번호(" + selectedRow + "행 0열): " + selectedNo);

			upNo = selectedNo; // 왜? 영역이 다른 update액션에서 사용할 수 있도록

			Person p = m.select(selectedNo);
			form.tf_name.setText(p.getName());
			form.tf_age.setText(p.getAge() + "");
			// setText()메소드는 문자열 파라미터를 원하므로 setText(13+"");
			form.tf_job.setText(p.getJob());

			form.initUpForm();
			mainV.setVisible(false);
			form.setVisible(true);// 수정폼 보여주기

		} else if (ob == mainV.bt_delete) {// 1. 메인에서 '삭제'버튼을 클릭했다면
			// String str = JOptionPane.showInputDialog(mainV, "삭제할 번호:");
			String str = mainV.showInput("삭제할 번호:");

			if (str == null) { // 취소나 X버튼을 클릭시 str에는 null값이 전달
				// null체크
				return;
			}

			if (!str.matches("[\\d]+")) {// 숫자체크
				JOptionPane.showMessageDialog(mainV, "숫자만 입력!!");
				return;
			}

			int delNo = Integer.parseInt(str);

			int t = JOptionPane.showConfirmDialog(mainV, "정말삭제?");

			if (t != 0)
				return;

			// 삭제할 번호 존재유무
			/*
			 * Person p = m.select(delNo);//검색 if(p==null){//일치하는 번호를 찾지 못했음!!
			 * JOptionPane.showMessageDialog(mainV, "존재하지 않는 번호입니다!!"); return;
			 * }
			 */

			// if(t==0){//'예'버튼을 클릭했다면
			if (!m.delete(delNo)) { // 삭제작업 종료, 실제삭제코드
				JOptionPane.showMessageDialog(mainV, "[존재하지 않는 번호입니다!!]");
				return;
			}
			mainV.displayTable(m.selectAll()); // 삭제후 변경된 벡터를 얻어오기
			// }

		} else if (ob == mainV.bt_exit) {// 1. 메인에서 '종료'버튼을 클릭했다면
			System.exit(0);
		} else if (ob == form.bt_submit || ob == form.tf_job) {
			// 1. 입력폼에서 '입력'버튼을 클릭했다면
			// 1. 수정폼에서 '수정'버튼을 클릭했다면

			String name = form.tf_name.getText().trim();// 2.
			String ageStr = form.tf_age.getText().trim();// 2.
			String job = form.tf_job.getText().trim();// 2.

			int age;

			Person p;// 3.

			// InputForm객체 한개를 사용하기 때문에 입력과 수정을 구분!!
			if (form.getTitle().equals("입력폼")) {// 입력폼이라면
				// 유효성검사!!(빈값 체크)
				// 기본식: if(name == null || name.length() < 1)
				// NullPointerException예방
				// if(name.length() == 0)

				boolean flag = true;
				if (name.equals("")) {
					JOptionPane.showMessageDialog(form, "이름입력!!");
					form.tf_name.requestFocus();
				} else if (ageStr.length() == 0) {
					JOptionPane.showMessageDialog(form, "나이입력!!");
					form.tf_age.requestFocus();
				} else if (!ageStr.matches("[0-9]+")) {// 나이에 대한 숫자 체크
					JOptionPane.showMessageDialog(form, "나이는 숫자만입력!!");
					form.tf_age.setText("");
					form.tf_age.requestFocus();
				} else if (job.length() < 1) {
					JOptionPane.showMessageDialog(form, "직업입력!!");
					form.tf_job.requestFocus();
				} else {
					// 이름,나이,직업이 전부 입력되었다면
					flag = false;
				}

				if (flag)
					return;

				age = Integer.parseInt(ageStr);// 데이터도 입력, 숫자조합!!

				cntNo++;// 1증가 번호
				p = new Person(cntNo, name, age, job);
				m.insert(p);// 3_1 -----> p.getNo()? ---> 1
			} else {// 수정폼이라면

				// 유효성검사할 데이터를 배열로 묶어줌.
				String data[] = { name, ageStr, job };

				if (isEmpty(data)) { // 빈값발견시
					JOptionPane.showMessageDialog(form, "데이터를 전부 입력!!");
					return;
				}

				age = Integer.parseInt(ageStr);// 데이터도 입력, 숫자조합!!

				p = new Person(upNo, name, age, job);// (수정할 번호, 수정할 데이터)
				m.update(p);// 3_1 -----> p.getNo()? ---> 5
			}

			// Vector<Person> v = m.selectAll(); //3_2
			// mainV.displayTable(v);
			mainV.displayTable(m.selectAll());// 벡터의 현재내용을 JTable에 출력.

			form.setVisible(false);// 4.
			mainV.setVisible(true);// 4.

		} else if (ob == form.bt_cancel) {// 1. 입력폼에서 '취소'버튼을 클릭했다면
			form.setVisible(false);
			mainV.setVisible(true);
		} else if (ob == form.tf_name) {
			form.tf_age.requestFocus();
		} else if (ob == form.tf_age) {
			form.tf_job.requestFocus();
		}
		// else if(ob== form.tf_job){}

	}// actionPerformed

	// 수정폼의 유효성 검사
	public boolean isEmpty(String data[]) {// 빈값 발견시 true값 리턴
		for (int i = 0; i < data.length; i++) {
			if (data[i].length() == 0)
				return true;
		}
		return false;// 전체 문자열데이터가 빈값 없음
	}// isEmpty

	public static void main(String[] args) {
		new Controller();
	}

}
