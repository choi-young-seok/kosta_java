package HomeWork.j0725;

public class Test {
	
  static void hello(){}	
	
	
  public static void main(String[] args) {
	  hello();
	  
/*
9. int su[]={1, 2, 3, 4, 5};

   su3�̶�� �迭�� ���� su�迭�� ���� ����.
   int su3[];
      su3 = su; (X)
   su3[2]=33;	 
*/
	  int su[]={1, 2, 3, 4, 5};//length: 5
	  //        0  1  2  3  4 ����
	  
	  int su3[];
	      //su3 = su;//int su3[]={1, 2, 33, 4, 5};
	      su3 = new int[su.length]; // int su3[]={0,0,0,0,0};
	  for(int i=0; i<su3.length; i++){
		  su3[i]= su[i];
	  }//int su3[]={1, 2, 3, 4, 5};	  
	  
	  su3[2]=33;
	  
	  System.out.println("su3�迭 ���~!!");    
	  for (int i = 0; i < su3.length; i++) {
		  System.out.println("su3["+i+"]="+su3[i]);
	  }   
	  
	  System.out.println("su�迭 ���~!!");    
	  for (int i = 0; i < su.length; i++) {
		  System.out.println("su["+i+"]="+su[i]);
	  }    
	  
/*
   10. int su[]={1,2,3,4,5};
   ---> for���� ���� [0]����~[4]�������� ����� ������
        5 4 3 2 1 �� ���� ��µǵ��� �Ͻÿ�. 	  
 */
//	[0]���� --- [4]����
//	[1]���� --- [3]����
	int temp;
	for(int i=0,j=su.length-1; i< su.length/2; i++,j--){
		temp = su[i];
		su[i] = su[j];
	    su[j] = temp;
	}	 
	  
    System.out.println("========================");
    for(int i=0; i<su.length; i++){
       System.out.print(su[i]+" ");
    }
	  
	  
  }//main
}//class





