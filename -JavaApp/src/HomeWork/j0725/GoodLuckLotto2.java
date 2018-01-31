package HomeWork.j0725;

import java.util.Arrays;
import java.util.Random;

public class GoodLuckLotto2 {
   int lotto[];
   Random r;
   
   public GoodLuckLotto2() {
	  lotto = new int[6];//6자리 정수  [0]~[5]
	  r = new Random(); 
   }//생성자
   
   public void printLotto(){
	  Arrays.sort(lotto); 
	  for(int i=0; i<lotto.length; i++){
		 System.out.print(lotto[i]);
		 if(i < lotto.length-1)System.out.print(", ");//0~4
	  }
   }//printLotto
   
   public void createLotto(){
	 for(int i=0; i<lotto.length; i++){//0~5		 
	   lotto[i]= r.nextInt(45)+1 ; //1~45  난수를 저장
	   if(duplicateCheck(i)){i--;}
	 }  
   }//번호생성
   
   public boolean duplicateCheck(int idx){//idx: 난수가 저장된 인덱스
	  //중복된 수 발견시 true리턴
	  //1-->0   2-->1,0  3-->2,1,0  4-->3,2,1,0
	 for(int i=idx-1; i>=0; i--){
		if(lotto[idx] == lotto[i]) return true;//중복된수 발견시
	 }
	  return false;//중복된수 발견되지 않음
   }//중복체크
	
	
   public static void main(String[] args) {
	  System.out.println("★★ 금주 행운의 로또번호 ★★");
	  GoodLuckLotto2 good = new GoodLuckLotto2();
	  for(int i=1; i<6; i++){//1~5회를 표현
		System.out.print(i+"회: "); 
		good.createLotto();
	    good.printLotto();
	    System.out.println();
	  }
	  	   
	   
	    
   }//main
}




