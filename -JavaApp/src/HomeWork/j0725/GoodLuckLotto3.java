package HomeWork.j0725;

import java.util.Random;

public class GoodLuckLotto3 {
   public static void main(String[] args) {
	  //������ ������ �̿� 1~45������ �ߺ����� �ʴ� ���� 6���� �迭�� ����.
	   
	  int lotto[]=new int[45];//{0,0,0,0,0,0} [0]~[44]
	  
	  Random r = new Random();
	  
	  for(int i=0; i<lotto.length; i++){
		 lotto[i] = i+1;  //lotto[0]=1   lotto[13]=14  lotto[44]=45
	  }
	  
	  //��ȣ����
	  int temp;
	  for(int i=0; i<1000; i++){
		  int randIdx = r.nextInt(44)+1;
		  temp = lotto[0];
		  lotto[0] = lotto[randIdx];
		  lotto[randIdx] = temp;
	  }
	  
	  //Arrays.sort(lotto);
	  
	  for (int i = 0; i < 6; i++) {
		 System.out.println("lotto["+i+"]="+lotto[i]);
	  }
   }
}




