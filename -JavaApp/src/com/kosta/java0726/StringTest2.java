package com.kosta.java0726;

public class StringTest2 {
	public static void main(String[] args) {
		// 문제1 ) str안에 들어가는 숫자의 개수를 출력하시오
		String str = "09JavaPro8grammi5ng";
		// 0~9 = 48 ~ 57 = 아스키코드

		byte b[] = str.getBytes();

		int count = 0;

		for (int i = 0; i < b.length; i++) {
			if ((b[i] >= 48) && (b[i] <= 57)) {
				count++;
			}
		}
		System.out.println("갯수 : " + count);

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) // str.length(전체 문자열의 길이만큼 반복)
		{
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				cnt++;
			}
		}
		System.out.println("갯수 : " + cnt);

		// 문제2 ) tel1 = "010"; , tel2 = "1234"; , tel3 = "4567";
		// - =77
		// subString, indexof, charat
		String tel = "010-1234-4567";
		// 인덱스 0123456789012
		// 문제2 ) tel1 = "010"; , tel2 = "1234"; , tel3 = "4567";
		// 012 4567 9012

		String tel1 = tel.substring(0, tel.indexOf('-'));
		String tel2 = tel.substring(tel.indexOf('-') + 1, tel.indexOf('-', tel.indexOf('-') + 1));
		String tel3 = tel.substring(tel.lastIndexOf('-') + 1);

		System.out.println("tel1 :" + tel1);
		System.out.println("tel2 :" + tel2);
		System.out.println("tel3 :" + tel3);

		// 풀이))
		String telNum = "010-1234-4567";

		int idx1 = tel.indexOf('-');
		int idx2 = tel.lastIndexOf('-');

		String tel4 = tel.substring(0, idx1);
		String tel5 = tel.substring(idx1 + 1, tel.indexOf('-', idx1 + 1));
		String tel6 = tel.substring(idx2 + 1);

		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);

		System.out.println(tel4 + tel5 + tel6);

	}

}
