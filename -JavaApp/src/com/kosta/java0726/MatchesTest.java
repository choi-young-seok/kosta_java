package com.kosta.java0726;

public class MatchesTest {
	public static void main(String[] args) {
//		String str = "";
//		
//		//str.matches(String regex)
//		boolean b = str.matches("[abc]"); //strÀÌ [a]¶ó´Â ±ÔÄ¢À» °®´ÂÁö °Ë»ç
//		System.out.println(b);
//		
//		 /*
//	    [a] : a¹®ÀÚ°¡ 1¹ø ÃâÇö
//	    [a]? : a¹®ÀÚ°¡ 0~1¹ø ÃâÇö -> 2¹øÀÌ»ó ÃâÇöÇÒ °æ¿ì false
//	    [a]* : a¹®ÀÚ°¡ 0~¹«ÇÑ´ë ÃâÇö 
//	    [a]+ : a¹®ÀÚ°¡ ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó ~ ¹«ÇÑ´ë ÃâÇö
//	   */
//		
//		String str2 = "d";
//		System.out.println(str2.matches("[abc]?"));
//		//ÀüÃ¼ ¹®ÀÚ¿­Áß a,b,c Áß¿¡ ÇÏ³ª°¡ ³ª¿À°Å³ª ¾È³ª¿À°Å³ª
//		
//		System.out.println("===================================");
//		
//		//¼ıÀÚ°Ë»ç(¼ıÀÚ Á¶ÇÕ ¿©ºÎ °Ë»ç)
//		String str3 = "34";
//		System.out.println(str3.matches("[0123456789]")); // 0~9 Áß ÇÑ°¡Áö¶óµµ 
//		System.out.println(str3.matches("[0123456789]?")); // 0~9 Áß ÇÑ°¡Áö¶óµµ, ºó¹®ÀÚ¿­
//		System.out.println(str3.matches("[0123456789]*")); // 0~9 Á¶ÇÕÀÌ 0~¹«ÇÑ´ë
//		System.out.println(str3.matches("[0123456789]+")); // 0~9 Á¶ÇÕÀÌ 1~¹«ÇÑ´ë
//		
//		System.out.println("===================================");
//		
//		//¿µ¹®Á¶ÇÕ
//		String str4 = "abcd";
//		
//		System.out.println("str4"+str4.matches("[a-z]")); //[-] ´ë°ıÈ£ ³»¾Ö¼­ '-'´Â ¹üÀ§(~)¸¦ Ç¥ÇöÇÏ±â ¶§¹®¿¡ a~z±îÁöÀÇ ÀÇ¹Ì°¡ ÀÖ´Ù.
//		System.out.println("str4"+str4.matches("[a-zA-Z0-9]+")); //a~z
//		System.out.println("str4"+str4.matches("[a-zA-Z]{3}")); //3ÀÚ¸®
//		System.out.println("str4"+str4.matches("[a-zA-Z]{3,6}")); //3ÀÚ¸®~6ÀÚ¸®
//		
//		  
//		System.out.println("===================================");
//		
//		//ÇÑ±ÛÁ¶ÇÕ
//		String str5="È«±æµ¿";
//		System.out.println(str5.matches("[¤¡-ÆR]+"));
//		System.out.println(str5.matches("[^abc]")); // a,b,c¸¦ Á¦¿ÜÇÏ°í
//		
//		System.out.println("===================================");
//		
//		//¿µ¹®ÀÚ Á¶ÇÕÀÌ ¾Æ´Ñ °ªÀ» Ã¼Å©
//		String str6 = "abcd";
//		if(!str6.matches("[a-zA-Z]+")){
//			System.out.println("¿µ¹®ÀÚ Á¶ÇÕ¸¸ ÀÔ·Â");
//		}
//		else
//			System.out.println("Åë°ú");
		
		String str7 = "kancho33";
		String str8 = "";
//		System.out.println("str7 : "+str7.matches("^[a-zA-Z0-9]?+{4,12}$"));
		System.out.println("str7 : "+str7.matches("^[a-zA-Z0-9]*$"));
		System.out.println("str8 : "+str8.matches("^[a-zA-Z0-9]*$"));
//		System.out.println("str7 : "+str7.matches("\w"));
	}
}
