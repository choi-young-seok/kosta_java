package com.kosta.java0802;

import java.util.Random;

import javax.swing.JFrame;

public class NumberBaseball2 extends JFrame {
	int ranNum[];
	Random random;
	int toIntArray[];
	int start, S, B;
	
	//배열 초기화 메소드
	public void initRanNum(){
		for (int i = 0; i < ranNum.length; i++) {
			ranNum[i] =  random.nextInt(10);
		}
	}
	//난수발생 메소드
	public void shakeRanNum(){
		int temp = 0;
		for (int i = 0; i < 10000; i++) {
			temp = ranNum[0];
			ranNum[0] = ranNum[random.nextInt(10)];
			ranNum[random.nextInt(10)] = temp;
		}
	}
	//TextField로부터 입력받은 값(String자료형)을 int형변환 메소드
	public void toIntArray(String inputString){
		String inputStringNum[] = inputString.split("");
		for (int i = 0; i < inputStringNum.length; i++) {
			toIntArray[i] = Integer.parseInt(inputStringNum[i]);
		}
	}
	//입력받은 field의 값을 변환한 int형 배열과 난수가 저장된 int형 배열 비교 메소드
	public void toCheckNum(){
		for (int i = 0; i < toIntArray.length; i++) {
			for (int j = 0; j < 3; j++) {
				if(toIntArray[i]==ranNum[j]){
					if(i==j){
						S++;
					}else{
						B++;
					}
				}
			}
		}
	}
	//(시작cnt, 숫자비교S,B)숫자 초기화 메소드
	public void initNum(){
		start = 0;
		S = 0;
		B = 0;
	}	
	//유효성검사 (널검사if(equels("") + 숫자검사:matches)
	public void regexp(){
		
	}
	public NumberBaseball2() {
		setTitle("숫자야구 게임");
		
		ranNum = new int[10];
		toIntArray = new int[3];
		random = new Random();
		
	}//생성자
	
	public static void main(String[] args) {
		new NumberBaseball2();
	}
	
}