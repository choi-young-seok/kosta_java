package com.kosta.java0726;

public class MatchesTest {
	public static void main(String[] args) {
//		String str = "";
//		
//		//str.matches(String regex)
//		boolean b = str.matches("[abc]"); //str�� [a]��� ��Ģ�� ������ �˻�
//		System.out.println(b);
//		
//		 /*
//	    [a] : a���ڰ� 1�� ����
//	    [a]? : a���ڰ� 0~1�� ���� -> 2���̻� ������ ��� false
//	    [a]* : a���ڰ� 0~���Ѵ� ���� 
//	    [a]+ : a���ڰ� �ּ� �ѹ� �̻� ~ ���Ѵ� ����
//	   */
//		
//		String str2 = "d";
//		System.out.println(str2.matches("[abc]?"));
//		//��ü ���ڿ��� a,b,c �߿� �ϳ��� �����ų� �ȳ����ų�
//		
//		System.out.println("===================================");
//		
//		//���ڰ˻�(���� ���� ���� �˻�)
//		String str3 = "34";
//		System.out.println(str3.matches("[0123456789]")); // 0~9 �� �Ѱ����� 
//		System.out.println(str3.matches("[0123456789]?")); // 0~9 �� �Ѱ�����, ���ڿ�
//		System.out.println(str3.matches("[0123456789]*")); // 0~9 ������ 0~���Ѵ�
//		System.out.println(str3.matches("[0123456789]+")); // 0~9 ������ 1~���Ѵ�
//		
//		System.out.println("===================================");
//		
//		//��������
//		String str4 = "abcd";
//		
//		System.out.println("str4"+str4.matches("[a-z]")); //[-] ���ȣ ���ּ� '-'�� ����(~)�� ǥ���ϱ� ������ a~z������ �ǹ̰� �ִ�.
//		System.out.println("str4"+str4.matches("[a-zA-Z0-9]+")); //a~z
//		System.out.println("str4"+str4.matches("[a-zA-Z]{3}")); //3�ڸ�
//		System.out.println("str4"+str4.matches("[a-zA-Z]{3,6}")); //3�ڸ�~6�ڸ�
//		
//		  
//		System.out.println("===================================");
//		
//		//�ѱ�����
//		String str5="ȫ�浿";
//		System.out.println(str5.matches("[��-�R]+"));
//		System.out.println(str5.matches("[^abc]")); // a,b,c�� �����ϰ�
//		
//		System.out.println("===================================");
//		
//		//������ ������ �ƴ� ���� üũ
//		String str6 = "abcd";
//		if(!str6.matches("[a-zA-Z]+")){
//			System.out.println("������ ���ո� �Է�");
//		}
//		else
//			System.out.println("���");
		
		String str7 = "kancho33";
		String str8 = "";
//		System.out.println("str7 : "+str7.matches("^[a-zA-Z0-9]?+{4,12}$"));
		System.out.println("str7 : "+str7.matches("^[a-zA-Z0-9]*$"));
		System.out.println("str8 : "+str8.matches("^[a-zA-Z0-9]*$"));
//		System.out.println("str7 : "+str7.matches("\w"));
	}
}
