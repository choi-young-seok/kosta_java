package com.kosta.java0726;

public class MatchesTest {
	public static void main(String[] args) {
//		String str = "";
//		
//		//str.matches(String regex)
//		boolean b = str.matches("[abc]"); //str이 [a]라는 규칙을 갖는지 검사
//		System.out.println(b);
//		
//		 /*
//	    [a] : a문자가 1번 출현
//	    [a]? : a문자가 0~1번 출현 -> 2번이상 출현할 경우 false
//	    [a]* : a문자가 0~무한대 출현 
//	    [a]+ : a문자가 최소 한번 이상 ~ 무한대 출현
//	   */
//		
//		String str2 = "d";
//		System.out.println(str2.matches("[abc]?"));
//		//전체 문자열중 a,b,c 중에 하나가 나오거나 안나오거나
//		
//		System.out.println("===================================");
//		
//		//숫자검사(숫자 조합 여부 검사)
//		String str3 = "34";
//		System.out.println(str3.matches("[0123456789]")); // 0~9 중 한가지라도 
//		System.out.println(str3.matches("[0123456789]?")); // 0~9 중 한가지라도, 빈문자열
//		System.out.println(str3.matches("[0123456789]*")); // 0~9 조합이 0~무한대
//		System.out.println(str3.matches("[0123456789]+")); // 0~9 조합이 1~무한대
//		
//		System.out.println("===================================");
//		
//		//영문조합
//		String str4 = "abcd";
//		
//		System.out.println("str4"+str4.matches("[a-z]")); //[-] 대괄호 내애서 '-'는 범위(~)를 표현하기 때문에 a~z까지의 의미가 있다.
//		System.out.println("str4"+str4.matches("[a-zA-Z0-9]+")); //a~z
//		System.out.println("str4"+str4.matches("[a-zA-Z]{3}")); //3자리
//		System.out.println("str4"+str4.matches("[a-zA-Z]{3,6}")); //3자리~6자리
//		
//		  
//		System.out.println("===================================");
//		
//		//한글조합
//		String str5="홍길동";
//		System.out.println(str5.matches("[ㄱ-힣]+"));
//		System.out.println(str5.matches("[^abc]")); // a,b,c를 제외하고
//		
//		System.out.println("===================================");
//		
//		//영문자 조합이 아닌 값을 체크
//		String str6 = "abcd";
//		if(!str6.matches("[a-zA-Z]+")){
//			System.out.println("영문자 조합만 입력");
//		}
//		else
//			System.out.println("통과");
		
		String str7 = "kancho33";
		String str8 = "";
//		System.out.println("str7 : "+str7.matches("^[a-zA-Z0-9]?+{4,12}$"));
		System.out.println("str7 : "+str7.matches("^[a-zA-Z0-9]*$"));
		System.out.println("str8 : "+str8.matches("^[a-zA-Z0-9]*$"));
//		System.out.println("str7 : "+str7.matches("\w"));
	}
}
