package HomeWork.j0726;

public class StringTest2 {
    public static void main(String[] args) {
	   String str="Jav3aPro8grammi5ng";
	   //인덱스    012345678901234567
	   
	   //문제1) str안에 들어가는 숫자의 개수를 출력하시오.
	   //힌트: getBytes(), toCharArray(), charAt(int index) 
//	   
//	   byte[] b= str.getBytes();
//	   int cnt=0;//숫자카운트
//	   //'0' ----> 48  '1'----> 49  '9'----->57   : 48~57
//	   for(int i=0; i<b.length; i++  ){//배열의 인덱스 표현
//		  //System.out.println(b[i]);
//		  if( b[i]>=48 && b[i]<=57  )cnt++; 
//	   }	   
//	   System.out.println("1. STR내의 숫자개수: "+ cnt);
//	   
//	   char ch[] = str.toCharArray();//{'J','a','v'}
//	   cnt=0;
//	   for (int i = 0; i < ch.length; i++) {
//		  if(ch[i]>='0' && ch[i]<='9')cnt++;
//	   }
//	   System.out.println("2. STR내의 숫자개수: "+ cnt);
//	   
//	   cnt=0;
//	   for(int i=0; i<str.length(); i++){//str.length(): 18
//		  char c = str.charAt(i);
//		  if(c>='0' &&  c<='9') cnt++;
//	   }
//	   System.out.println("3. STR내의 숫자개수: "+ cnt);
//	      
	   
	   String tel="010-1234-4567";
	   //인덱스    0123456789012
	   
	   String tel1,tel2,tel3;
	   //문제2) tel1="010", tel2="1234", tel3="4567"
	   //힌트: indexOf(), substring()
	   
//tel.substring(int beginIndex) , tel.substring(int beginIndex,int endIndex)
//	   int idx1= tel.indexOf('-'); // 3
//	   int idx2= tel.lastIndexOf('-');  //8
//	   
//	   
//	   tel1 = tel.substring(0,idx1);//(0,3);
//	   tel2 = tel.substring(idx1+1, idx2);//(4,8);
//	   tel2 = tel.substring(idx1+1, idx2);//(4,8);
//	   tel3 = tel.substring(idx2+1);//(9);
//	   
//	   System.out.println("TEL1: "+ tel1);
//	   System.out.println("TEL2: "+ tel2);
//	   System.out.println("TEL3: "+ tel3);
	   
	   
	   String str7 = "kancho";
	   System.out.println(str7.matches("^[0-9a-z]{4,8}$"));
	   
	}
}
