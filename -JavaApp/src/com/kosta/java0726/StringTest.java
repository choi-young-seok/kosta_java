package com.kosta.java0726;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JAVA";
		
		//문자열의 내용 비교 ★ : equals(), 
		//메모리 비교 : ==
		
		if(s1.equals(s2))
			System.out.println("문자열 내용 같음");
		else {
			System.out.println("문자열 내용 다름");
		}
		//equal = 대소문자 포함 비교
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("대소문자까지 같음");
		else
			System.out.println("문자열 내용다름");
		
		System.out.println("==============================");
		
		String str ="JavaProgramming";
		  //인덱스:   012345678901234    
		  
		System.out.println("str의 문자열길이: "+ str.length());
		System.out.println("str을 대문자로 변경: "+ str.toUpperCase());
		System.out.println("str을 소문자로 변경: "+ str.toLowerCase());
		
		System.out.println("==============================");
		
		//문자열내에 'a' ----> 'o' 변환(대체) :  replace(char oldChar, char newChar)  
		System.out.println("str.replace('a','o'): "+ str.replace('a','o'));
		//str = str.replace('a','o');
		System.out.println("STR="+str);
		 
		System.out.println("==============================");
		
		//특정문자('P')에 해당하는 인덱스를 얻어오기!!
		//문자와 숫자는 호환이 가능!!  --->   'a'(97)<100
		System.out.println("str.indexOf('P'): "+str.indexOf('P')); 
		//str.indexOf(97) ==str.indexOf('a')  
		  
		System.out.println("==============================");
		
		//substring(int beginIndex) 
		System.out.println("str.substring(str.indexOf('P')): "+
		                    str.substring(str.indexOf('P')));
		                  //str.substring(4);	  
		  
		System.out.println("==============================");
		
		//특정문자열로 시작: startsWith(String prefix)
		//특정문자열로 끝나는지 체크: endsWith(String suffix)
		  
		System.out.println("str.startsWith(\"Java\"): "+ str.startsWith("Java")); 
		System.out.println("str.endsWith('ing'): "+ str.endsWith("ing"));
		
		System.out.println("==============================");
		
		//문자열 앞뒤의 연속된 문자열을 제거: trim()
		str = str.trim();
		System.out.println("STR(공백제거)= "+ str + "("+ str.length()+")");
		
		System.out.println("==============================");
  
	    /*
	              str.getBytes()               str.toCharArray()   
	             <--------------                --------------->     
	      byte b[]              String str="abc";             char ch[]
	      ={97,98,99};                                      ={'a','b','c'};
	             --------------->               <---------------
	               new String(b);                 new String(ch);
	     */
		
		String str2 = "abc";
		
		byte b[] = str2.getBytes();
		System.out.println("String 문자열을 byte 배열로 변환 :");
		for (int i = 0; i < b.length; i++) {
			System.out.println("b["+i+"] :"+ b[i]);
		}
		System.out.println();
		
		
		str = "수민짜으으으응";
		char ch[] = str.toCharArray();
		System.out.println("String 문자열을 char 배열로 변환 :");
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println("ch["+i+"] : "+ch[i]);
		}
		System.out.println();
		
//		String str3 = new String(b);
//		System.out.println(str3);
		
			
	}//main
}//class
