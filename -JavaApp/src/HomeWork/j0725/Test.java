package HomeWork.j0725;

public class Test {
	
  static void hello(){}	
	
	
  public static void main(String[] args) {
	  hello();
	  
/*
9. int su[]={1, 2, 3, 4, 5};

   su3이라는 배열을 만들어서 su배열의 값을 복사.
   int su3[];
      su3 = su; (X)
   su3[2]=33;	 
*/
	  int su[]={1, 2, 3, 4, 5};//length: 5
	  //        0  1  2  3  4 번지
	  
	  int su3[];
	      //su3 = su;//int su3[]={1, 2, 33, 4, 5};
	      su3 = new int[su.length]; // int su3[]={0,0,0,0,0};
	  for(int i=0; i<su3.length; i++){
		  su3[i]= su[i];
	  }//int su3[]={1, 2, 3, 4, 5};	  
	  
	  su3[2]=33;
	  
	  System.out.println("su3배열 출력~!!");    
	  for (int i = 0; i < su3.length; i++) {
		  System.out.println("su3["+i+"]="+su3[i]);
	  }   
	  
	  System.out.println("su배열 출력~!!");    
	  for (int i = 0; i < su.length; i++) {
		  System.out.println("su["+i+"]="+su[i]);
	  }    
	  
/*
   10. int su[]={1,2,3,4,5};
   ---> for문을 통해 [0]번지~[4]번지까지 출력을 했을때
        5 4 3 2 1 과 같이 출력되도록 하시오. 	  
 */
//	[0]번지 --- [4]번지
//	[1]번지 --- [3]번지
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





