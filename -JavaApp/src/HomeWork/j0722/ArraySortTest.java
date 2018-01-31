package HomeWork.j0722;

import java.util.Arrays;
import java.util.Random;

public class ArraySortTest {
   int su[];
   Random r;
   
   //�������迭 ��ü������:  �ڷ��� �迭��[]=new �ڷ���[�迭ũ��];
   public ArraySortTest() {
	 su=new int[5];
	 r = new Random();
   }
   
   public void printArray(){
	 System.out.print("[");
	 for(int i=0; i<su.length; i++){//su.length: 5   i:0,1,2,3,4
	   System.out.print(su[i]);
	   if(i<su.length-1)System.out.print(", ");
	 }
	 System.out.println("]");
   }//printArray
   
   public void inputArray(){//������ ��(����)�� �迭�� �Է�
	   //r.nextInt(int bound)  bound:5   ---> 0~4
	  for (int i = 0; i < su.length; i++) {
		su[i] = r.nextInt(100) + 1;  //0~99 + 1  ---> 1~100 
	  }
   }//inputArray
   
   public void sortArray(){//�ε���: 0 1 2 3 4
	  int tmp;//�ӽú��� 
	  for(int i=0; i<su.length-1; i++){//�� ���ʵ����� �ε��� (0~3)
		for(int j=i+1; j<su.length; j++){//�� �����ʵ����� �ε��� (1~4)
		  if(su[i] > su[j]){//�������������� ����: ���ʵ����Ͱ� ũ�ٸ�!!	
			tmp  = su[i];
			su[i]= su[j];
			su[j]= tmp;
		  }	
		}
	  }
   }//sortArray
   
   public static void main(String[] args) {
	  ArraySortTest  ast = new ArraySortTest();
	    ast.inputArray();
	    System.out.print("������ ������:");  
	    ast.printArray();
	    
	    ast.sortArray();
	    System.out.print("������ ������:"); 
	    ast.printArray();
	    System.out.println("====================");
	    int su[]={23,34,11,8,102,33};
	    
	    Arrays.sort(su);
	    for (int i = 0; i < su.length; i++) {
		  System.out.println(su[i]);
		}
	    
	    
	    System.out.println("====================");
	    String names[]={"ȫ�浿","�����","���ֿ�","�̼���","������"};
	    Arrays.sort(names);
	    for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	    
   }
}



