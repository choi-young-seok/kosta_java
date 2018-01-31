package com.kosta.java0726;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JAVA";
		
		//���ڿ��� ���� �� �� : equals(), 
		//�޸� �� : ==
		
		if(s1.equals(s2))
			System.out.println("���ڿ� ���� ����");
		else {
			System.out.println("���ڿ� ���� �ٸ�");
		}
		//equal = ��ҹ��� ���� ��
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("��ҹ��ڱ��� ����");
		else
			System.out.println("���ڿ� ����ٸ�");
		
		System.out.println("==============================");
		
		String str ="JavaProgramming";
		  //�ε���:   012345678901234    
		  
		System.out.println("str�� ���ڿ�����: "+ str.length());
		System.out.println("str�� �빮�ڷ� ����: "+ str.toUpperCase());
		System.out.println("str�� �ҹ��ڷ� ����: "+ str.toLowerCase());
		
		System.out.println("==============================");
		
		//���ڿ����� 'a' ----> 'o' ��ȯ(��ü) :  replace(char oldChar, char newChar)  
		System.out.println("str.replace('a','o'): "+ str.replace('a','o'));
		//str = str.replace('a','o');
		System.out.println("STR="+str);
		 
		System.out.println("==============================");
		
		//Ư������('P')�� �ش��ϴ� �ε����� ������!!
		//���ڿ� ���ڴ� ȣȯ�� ����!!  --->   'a'(97)<100
		System.out.println("str.indexOf('P'): "+str.indexOf('P')); 
		//str.indexOf(97) ==str.indexOf('a')  
		  
		System.out.println("==============================");
		
		//substring(int beginIndex) 
		System.out.println("str.substring(str.indexOf('P')): "+
		                    str.substring(str.indexOf('P')));
		                  //str.substring(4);	  
		  
		System.out.println("==============================");
		
		//Ư�����ڿ��� ����: startsWith(String prefix)
		//Ư�����ڿ��� �������� üũ: endsWith(String suffix)
		  
		System.out.println("str.startsWith(\"Java\"): "+ str.startsWith("Java")); 
		System.out.println("str.endsWith('ing'): "+ str.endsWith("ing"));
		
		System.out.println("==============================");
		
		//���ڿ� �յ��� ���ӵ� ���ڿ��� ����: trim()
		str = str.trim();
		System.out.println("STR(��������)= "+ str + "("+ str.length()+")");
		
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
		System.out.println("String ���ڿ��� byte �迭�� ��ȯ :");
		for (int i = 0; i < b.length; i++) {
			System.out.println("b["+i+"] :"+ b[i]);
		}
		System.out.println();
		
		
		str = "����¥��������";
		char ch[] = str.toCharArray();
		System.out.println("String ���ڿ��� char �迭�� ��ȯ :");
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println("ch["+i+"] : "+ch[i]);
		}
		System.out.println();
		
//		String str3 = new String(b);
//		System.out.println(str3);
		
			
	}//main
}//class
