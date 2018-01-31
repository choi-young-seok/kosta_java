package com.kosta.calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.kosta.calc.model.Calculator;
import com.kosta.calc.view.CalcView;

/*
	★★★<컨트롤러의 역할>
	1. 사용자 요청을 분석
	2. 뷰를 통해 입력된 데이터를 얻어오기
	3. 모델객체생성★
	    - 메소드호출
	    - 결과값을 변수에 저장
	4. 페이지이동(프레임 이동)
	
	추가(옵션): 유효성검사
*/
public class CalcController implements ActionListener{
	//뷰를 등록
	CalcView calcView;

	public CalcController() {
		//View객체 생성 
		calcView = new CalcView("MVC model2 calculator Test");
		//View의 이벤트 리스너 등록
		calcView.button1.addActionListener(this);
	}
	
	//View의 이벤트 핸들러
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==calcView.button1){
			int num1 = Integer.parseInt(calcView.field1.getText());
			int num2 = Integer.parseInt(calcView.field2.getText());
			
			//Object 타입의 자료형을 변환하는 방법
			//1.자식 클래스형으로 강제 형변환
			//2.Object class의 toString을 이용
			String operator = (String)calcView.box.getSelectedItem();
//			String operator = calcView.box.getSelectedItem().toString();
			
			Calculator calculator = new Calculator(num1, num2, operator);
			String result = calculator.getResult();
			
			calcView.jLabel.setText(result);
		}
	}//actionPerformed
	public static void main(String[] args) {
		new CalcController();
	}

}
