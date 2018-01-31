package HomeWork.j0725;

import java.util.Arrays;
import java.util.Random;

public class GoodLuckLotto2 {
   int lotto[];
   Random r;
   
   public GoodLuckLotto2() {
	  lotto = new int[6];//6�ڸ� ����  [0]~[5]
	  r = new Random(); 
   }//������
   
   public void printLotto(){
	  Arrays.sort(lotto); 
	  for(int i=0; i<lotto.length; i++){
		 System.out.print(lotto[i]);
		 if(i < lotto.length-1)System.out.print(", ");//0~4
	  }
   }//printLotto
   
   public void createLotto(){
	 for(int i=0; i<lotto.length; i++){//0~5		 
	   lotto[i]= r.nextInt(45)+1 ; //1~45  ������ ����
	   if(duplicateCheck(i)){i--;}
	 }  
   }//��ȣ����
   
   public boolean duplicateCheck(int idx){//idx: ������ ����� �ε���
	  //�ߺ��� �� �߽߰� true����
	  //1-->0   2-->1,0  3-->2,1,0  4-->3,2,1,0
	 for(int i=idx-1; i>=0; i--){
		if(lotto[idx] == lotto[i]) return true;//�ߺ��ȼ� �߽߰�
	 }
	  return false;//�ߺ��ȼ� �߰ߵ��� ����
   }//�ߺ�üũ
	
	
   public static void main(String[] args) {
	  System.out.println("�ڡ� ���� ����� �ζǹ�ȣ �ڡ�");
	  GoodLuckLotto2 good = new GoodLuckLotto2();
	  for(int i=1; i<6; i++){//1~5ȸ�� ǥ��
		System.out.print(i+"ȸ: "); 
		good.createLotto();
	    good.printLotto();
	    System.out.println();
	  }
	  	   
	   
	    
   }//main
}




