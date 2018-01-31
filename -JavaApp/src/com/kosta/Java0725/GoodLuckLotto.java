package com.kosta.Java0725;

import java.util.Random;

public class GoodLuckLotto {
	
	int lotto[] ;
	Random random;
	
	public GoodLuckLotto() {
		lotto = new int[45];
		random = new Random();
	}
	
	public void createLotto(){
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
			//System.out.print(lotto[i]+" ");
		}
	}
	
	public void randomNumber(){
		int temp;
		for (int i = 0; i < lotto.length; i++) {
			temp = lotto[i];
			lotto[i] = lotto[(random.nextInt(44)+1)];
			lotto[(random.nextInt(44)+1)]= temp;
		}
	}
	
	public void printLotto(){
		
			for (int j = 0; j < 6; j++) {
				System.out.printf("%02d",lotto[j]);
				System.out.print(" ");
			}
			System.out.println("");
		
	}
	
/*	public void sortLotto(){
		int temp[]=new int[6];
		for (int i = 0; i < 6; i++) {
			temp[i]=lotto[i];
			Arrays.sort(temp);
		}
	}*/
	
	public static void main(String[] args) {
		GoodLuckLotto goodLuckLotto = new GoodLuckLotto();
		System.out.println("★★금주 행운의 로또 번호★★");
		for (int i = 0; i < 5; i++) {
			System.out.print(i+"회 : ");
			goodLuckLotto.createLotto();
			goodLuckLotto.randomNumber();
//			goodLuckLotto.sortLotto();
			goodLuckLotto.printLotto();
		}
		
	}

}
